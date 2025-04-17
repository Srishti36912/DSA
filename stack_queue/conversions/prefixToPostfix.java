package stack_queue.conversions;

import java.util.Stack;

public class prefixToPostfix {
    static String preToPost(String pre_exp) {
        // code here
        Stack<String> st = new Stack<>();
        
        for(int i=pre_exp.length()-1; i>=0; i--) {
            char ch = pre_exp.charAt(i);
            
            if(Character.isLetterOrDigit(ch)) {
                st.push(String.valueOf(ch));
            }
            
            else {
                String temp1 = st.pop();
                String temp2 = st.pop();
                String temp = temp1 + temp2 + ch;
                st.push(temp);
            }
        }
        return st.pop();
    }
}
