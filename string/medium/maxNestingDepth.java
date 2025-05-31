package string.medium;

public class maxNestingDepth {
    public int maxDepth(String s) {
        int ans = 0;
        int open = 0;

        for(Character c : s.toCharArray()) {
            if(c == '(') {
                open++;
            }
            if(c == ')') {
                open--;
            }
            ans = Math.max(ans, open);
        }
        return ans;
    }
}
