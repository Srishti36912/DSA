package stack_queue.implementation;

import java.util.Stack;

public class StockSpanner {
    Stack<Pair<Integer, Integer>> st = new Stack<>();
    int idx = -1;

    public StockSpanner() {
        idx = -1;
        st.clear();
    }
    
    public int next(int price) {
        idx = idx + 1;
        while(!st.isEmpty() && st.peek().getKey() <= price) {
            st.pop();
        }
        int ans = idx - (st.isEmpty() ? -1 : st.peek().getValue());
        st.push(new Pair<>(price, idx));
        return ans;
    }
}
