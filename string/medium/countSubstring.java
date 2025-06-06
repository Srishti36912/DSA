package string.medium;

public class countSubstring {
    public static int countSubstring(String s) {
        // code here
        int max = 0, r = 0;
        int lastIndex[] = new int[3];
        
        for(int i=0; i<3; i++) {
            lastIndex[i] = -1;
        }
        
        while(r < s.length()) {
            lastIndex[s.charAt(r) - 'a'] = r;
            int minIndex = Math.min(lastIndex[0], Math.min(lastIndex[1], lastIndex[2]));
            if(minIndex != -1) {
                max += minIndex + 1;
            }
            r++;
        }
        return max;
    }
}
