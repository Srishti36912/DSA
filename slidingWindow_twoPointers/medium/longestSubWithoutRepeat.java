package slidingWindow_twoPointers.medium;

import java.util.HashMap;

public class longestSubWithoutRepeat {
    
     public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int len = 0;
        int left = 0, right = 0;
        int n = s.length();
        while(right < n) {
            if(map.containsKey(s.charAt(right))) {
                left = Math.max(map.get(s.charAt(right)) + 1, left);
            }
            map.put(s.charAt(right), right);
            len = Math.max(len, right - left + 1);
            right++;
        }

        return len;
    }
}
