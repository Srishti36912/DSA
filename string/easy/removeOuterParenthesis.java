package string.easy;

public class removeOuterParenthesis {
    public String removeOuterParentheses(String s) {
        int start = 0;
        int end = 0;
        int count = 0;

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == '(') {
                count++;
            }
            if(s.charAt(i) == ')') {
                count--;
                if(count == 0) {
                    end = i;
                    sb.append(s.substring(start+1, end));
                    start = ++end;
                }
            }
        }
        return sb.toString();
    }
}
