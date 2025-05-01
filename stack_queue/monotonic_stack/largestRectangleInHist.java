package stack_queue.monotonic_stack;

import java.util.Stack;

public class largestRectangleInHist {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> st = new Stack<>();
        int maxArea = 0;

        for(int i=0; i<heights.length; i++) {
            while(!st.isEmpty() && heights[st.peek()] > heights[i]) {
                int el = st.pop();
                int nse = i;
                int pse = st.isEmpty() ? -1 : st.peek();
                maxArea = Math.max(maxArea, heights[el] * (nse-pse-1));
            }
            st.push(i);
        }
        while(!st.isEmpty()) {
            int el = st.pop();
            int nse = heights.length;
            int pse = st.isEmpty() ? -1 : st.peek();
            maxArea = Math.max(maxArea, heights[el] * (nse-pse-1));
        }
        return maxArea;
    }
}
