package recursion.get_a_strong_hold;

import java.util.Stack;

public class reverseStack {
    static void reverse(Stack<Integer> s) {
        // add your code here
        if(!s.isEmpty()) {
            int x = s.pop();
            reverse(s);
            insertAtBottom(s, x);
        }
    }
    
    public static void insertAtBottom(Stack<Integer> s, int x) {
        if(s.isEmpty()) {
            s.push(x);
        } 
        else {
            int a = s.pop();
            insertAtBottom(s, x);
            s.push(a);
        }
    }
}
