package stack_queue.conversions;

import java.util.Stack;

public class infixToPostfix {
     public static String infixToPostfix(String s) {
        // code here
        String res = new String("");
        Stack <Character> st = new Stack<>();
        
        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if(Character.isLetterOrDigit(ch)) {
                res += ch;
            }
            else if(ch == '(') {
                st.push(ch);
            }
            else if(ch == ')') {
                while(! st.isEmpty() && st.peek() != '(') {
                    res += st.pop();
                }
                st.pop();
            } 
            else {
                while(! st.isEmpty() && Prec(ch) <= Prec(st.peek())) {
                    res += st.pop();
                }
                st.push(ch);
            }
        }
        while(! st.isEmpty()) {
            if(st.peek() == '(') {
                return "Invalid";
            }
            res += st.pop();
        }
        return res;
    }
    static int Prec(char ch) {
        switch(ch) {
            case '+':
            case '-':
                return 1;
            
            case '*':
            case '/':
                return 2;
            
            case '^':
                return 3;
        }
        return -1;
    }
}
