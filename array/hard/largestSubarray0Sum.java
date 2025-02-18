package array.hard;

import java.util.HashMap;

public class largestSubarray0Sum {
    int maxLen(int arr[]) {
        // code here
        int n = arr.length;
        int sum = 0, maxi = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i=0; i<n; i++) {
            sum = sum + arr[i];
            if(sum == 0) {
                maxi = Math.max(maxi, i+1);
            }
            else {
                if(map.get(sum) !=  null) {
                    maxi = Math.max(maxi, i-map.get(sum));
                }
                else {
                    map.put(sum, i);
                }
            }
        }
        return maxi;
    }
}
