package stack_queue.learning;

import java.util.Stack;

public class minStack {
    Stack<Long> st = new Stack<Long>();
    Long mini;
    public MinStack() {
        mini = Long.MAX_VALUE;
    }
    
    public void push(int val) {
        Long value = Long.valueOf(val);
        if(st.isEmpty()) {
            mini = value;
            st.push(value);
        } else {
            if(value < mini) {
                st.push(2 * value - mini);
                mini = value;
            } else {
                st.push(value);
            }
        }
    }
    
    public void pop() {
        if(st.isEmpty()) {
            return;
        }
        Long val = st.pop();
        if(val < mini) {
            mini = 2 * mini - val;
        }
    }
    
    public int top() {
        Long val = st.peek();
        if(val < mini) {
            return mini.intValue();
        }
        return val.intValue();
    }
    
    public int getMin() {
        return mini.intValue();
    }
}
