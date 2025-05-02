package stack_queue.monotonic_stack;

import java.util.Stack;

public class maximalRectangle {
    public int maximalRectangle(char[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int maxArea = 0;
        int pSum[][] = new int[n][m];

        for(int j=0; j<m; j++) {
            int sum = 0;
            for(int i=0; i<n; i++) {
                sum += Character.getNumericValue(matrix[i][j]);
                if(matrix[i][j] == '0') {
                    sum = 0;
                }
                pSum[i][j] = sum;
            }
        }
        for(int i=0; i<n; i++) {
            maxArea = Math.max(maxArea, lHist(pSum[i]));
        }
        return maxArea;
    }

    public int lHist(int arr[]) {
        int maxArea = 0;
        Stack<Integer> st = new Stack<>();

        for(int i=0; i<arr.length; i++) {
            while(!st.isEmpty() && arr[st.peek()] > arr[i]) {
                int el = st.pop();
                int nse = i;
                int pse = st.isEmpty() ? -1 : st.peek();
                maxArea = Math.max(maxArea, arr[el] * (nse-pse-1));
            }
            st.push(i);
        }

        while(!st.isEmpty()) {
            int el = st.pop();
            int nse = arr.length;
            int pse = st.isEmpty() ? -1 : st.peek();
            maxArea = Math.max(maxArea, arr[el] * (nse-pse-1));
        }
        return maxArea;
    }
}
