package array.easy;

import java.util.HashMap;

public class longestSubarrayPN {
    public int longestSubarray(int[] arr, int k) {
        // code here
        HashMap<Integer, Integer> preSumMap = new HashMap<>();
        int sum = 0;
        int maxLen = 0;
        
        for(int i=0; i<arr.length; i++) {
            sum = sum + arr[i];
            
            if(sum == k) {
                maxLen = Math.max(maxLen, i+1);
            }
            
            int rem = sum - k;
            if(preSumMap.containsKey(rem)) {
                int len = i - preSumMap.get(rem);
                maxLen = Math.max(maxLen, len);
            }
            if(!preSumMap.containsKey(sum)) {
                preSumMap.put(sum, i);
            }
        }
        return maxLen;
        }
}
