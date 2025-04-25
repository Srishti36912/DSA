package stack_queue.monotonic_stack;

import java.util.Stack;

public class nextSmallerElement {
    public int[] findNSE(int[] arr) {
        int n = arr.length;
        int nse[] = new int[n];
        Stack<Integer> st = new Stack<>();

        for(int i=n-1; i>=0; i--) {
            while(!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            nse[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }
        return nse;
    }

}
