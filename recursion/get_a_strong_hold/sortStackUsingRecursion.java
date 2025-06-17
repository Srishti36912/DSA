package recursion.get_a_strong_hold;

import java.util.Stack;

public class sortStackUsingRecursion {
    public Stack<Integer> sort(Stack<Integer> s) {
        // add code here
        if(!s.isEmpty()) {
            int x = s.pop();
            sort(s);
            sortedInsert(s, x);
        }
        return s;
    }
    
    public static void sortedInsert(Stack<Integer> s, int x) {
        if(s.isEmpty() || s.peek() < x) {
            s.push(x);
            return;
        }
        int temp = s.pop();
        sortedInsert(s, x);
        s.push(temp);
    }
}
