package binarySearch.BS_ON_1D;

import java.util.ArrayList;
import java.util.List;

public class findKthRotation {
    public int findKRotation(List<Integer> arr) {
        // Code here
        int low = 0, high = arr.size() - 1;
        int index = -1;
        List<Integer> ans = new ArrayList<>();
        ans.add(Integer.MAX_VALUE);
        
        while(low <= high) {
            int mid = (low + high) / 2;
            
            if(arr.get(low) <= arr.get(high)) {
                if(arr.get(low) < ans.get(ans.size() - 1)) {
                    ans.remove(ans.size() - 1);
                    ans.add(arr.get(low));
                    index = low;
                }
                break;
            }
            
            else if(arr.get(low) <= arr.get(mid)) {
                if(arr.get(low) < ans.get(ans.size() - 1)) {
                    ans.remove(ans.size() - 1);
                    ans.add(arr.get(low));
                    index = low;
                }
                low = mid + 1;
            }
            
            else {
                if(arr.get(mid) < ans.get(ans.size() - 1)) {
                    ans.remove(ans.size() - 1);
                    ans.add(arr.get(mid));
                    index = mid;
                }
                high = mid - 1;
            }
        }
        
        return index;
    }
}
