package slidingWindow_twoPointers.medium;

public class LongestRepeatCharReplace {
    
    public int characterReplacement(String s, int k) {
       int n = s.length();
       int l = 0, ans = 0, maxF = Integer.MIN_VALUE;
       int[] freq = new int[26];

       for(int r=0; r<n; r++) {
            freq[s.charAt(r) - 'A']++;
            maxF = Math.max(maxF, freq[s.charAt(r) - 'A']);
            int numC = (r - l + 1) - maxF;

            if(numC > k) {
                freq[s.charAt(l) - 'A']--;
                l++;
            }

            if(numC <= k) {
                ans = Math.max(ans, r - l + 1);
            }
        }
        return ans;
    }
}
