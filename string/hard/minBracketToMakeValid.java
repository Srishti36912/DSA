package string.hard;

public class minBracketToMakeValid {
    public int minAddToMakeValid(String s) {
        int open = 0;
        int minReq = 0;

        for(char c : s.toCharArray()) {
            if(c == '(') {
                open++;
            } else {
                if(open > 0) {
                    open--;
                } else {
                    minReq++;
                }
            }
        }
        return open + minReq;
    }
}
