package binarySearch.BS_Answers;

import java.util.Arrays;

public class aggressiveCows {
    
    public int aggressiveCows(int[] stalls, int k) {
        // code here
        int n = stalls.length;
        Arrays.sort(stalls);
        int low = 1, high = stalls[n - 1] - stalls[0];
        
        while(low <= high) {
            int mid = (low + high) / 2;
            if(cows(stalls, mid, k)) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return high;
    }
    
    private boolean cows(int[] stalls, int mid, int k) {
        int n = stalls.length;
        int count = 1;
        int last = stalls[0];
        
        for(int i=1; i<n; i++) {
            if(stalls[i] - last >= mid) {
                count++;
                last = stalls[i];
            }
            
            if(count >= k) {
                return true;
            }
        }
        return false;
    }
}
