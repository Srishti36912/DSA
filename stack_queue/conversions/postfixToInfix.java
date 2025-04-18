package stack_queue.conversions;

import java.util.Stack;

public class postfixToInfix {
    static String postToInfix(String exp) {
        // code here
        Stack<String> st = new Stack<>();
        
        for(int i=0; i<exp.length(); i++) {
            char ch = exp.charAt(i);
            
            if(Character.isLetterOrDigit(ch)) {
                st.push(String.valueOf(ch));
            }
            else {
                String el1 = st.pop();
                String el2 = st.pop();
                String temp = '(' + el2 + ch + el1 + ')';
                st.push(temp);
            }
        }
        return st.pop();
    }
}
