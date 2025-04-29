package stack_queue.monotonic_stack;

import java.util.Stack;

public class removeKdigits {
    public String removeKdigits(String num, int k) {
        Stack<Character> st = new Stack<>();

        for(int i=0; i<num.length(); i++) {
            while(!st.isEmpty() && k > 0 && st.peek() - '0' > num.charAt(i)-'0') {
                st.pop();
                k--;
            }
            st.push(num.charAt(i));
        }

        while(k > 0) {
            st.pop();
            k--;
        }

        if(st.isEmpty()) {
            return "0";
        }

        StringBuilder res = new StringBuilder();
        while(!st.isEmpty()) {
            res.append(st.pop());
        }

        String rev = res.reverse().toString();
        int idx = 0;

        while(idx < rev.length()) {
            if(rev.charAt(idx) == '0') {
                idx++;
            } else {
                break;
            }
        }

        rev = rev.substring(idx);
        if(rev.length() == 0) {
            return "0";
        }

        return rev;
    }
}
