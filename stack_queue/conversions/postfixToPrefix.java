package stack_queue.conversions;

import java.util.Stack;

public class postfixToPrefix {
    static String postToPre(String post_exp) {
        // code here
        Stack<String> st = new Stack<>();
        
        for(int i=0; i<post_exp.length(); i++) {
            char ch = post_exp.charAt(i);
            
            if(Character.isLetterOrDigit(ch)) {
                st.push(String.valueOf(ch));
            }
            
            else {
                String el1 = st.pop();
                String el2 = st.pop();
                String temp = ch + el2 + el1;
                st.push(temp);
            }
        }
        
        return st.pop();
    }
}
