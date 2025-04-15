package stack_queue.conversions;

import java.util.Stack;

public class prefixToInfix {
    static String preToInfix(String pre_exp) {
        // code here
        Stack<String> st = new Stack<>();
        
        for(int i=pre_exp.length()-1; i>=0; i--) {
            char ch = pre_exp.charAt(i);
            
            if(Character.isLetterOrDigit(ch)) {
                st.push(Character.toString(ch));
            } else {
                String s1 = st.pop();
                String s2 = st.pop();
                
                String temp = '(' + s1 + ch + s2 + ')';
                st.push(temp);
            }
        }
        return st.pop();
    }
}
