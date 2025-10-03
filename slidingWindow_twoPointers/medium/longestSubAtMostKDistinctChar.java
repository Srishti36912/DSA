package slidingWindow_twoPointers.medium;

import java.util.HashMap;

public class longestSubAtMostKDistinctChar {
    
    public int longestKSubstr(String s, int k) {
        // code here
        if(k == 0 || s.length() == 0) {
            return -1;
        }
        
        HashMap<Character, Integer> freq = new HashMap<>();
        int left = 0, maxLen = -1;
        
        for(int right=0; right<s.length(); right++) {
            char ch = s.charAt(right);
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
            
            if(freq.size() == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }
            
            else if(freq.size() > k) {
                
                while(freq.size() > k && left < right) {
                char leftCh = s.charAt(left);
                
                if(freq.get(leftCh) == 1) {
                    freq.remove(leftCh);
                }
                
                else {
                    freq.put(leftCh, freq.get(leftCh) - 1);
                }
                
                left++;
            }
            
            maxLen = Math.max(maxLen, right - left + 1);
            }
           
        }
        
        return maxLen;
        

        
    }
}
