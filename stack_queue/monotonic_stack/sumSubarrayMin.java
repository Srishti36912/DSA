package stack_queue.monotonic_stack;

import java.util.Stack;

public class sumSubarrayMin {
      public int sumSubarrayMins(int[] arr) {
        int nse[] = findNSE(arr);
        int pse[] = findPSEE(arr);
        long total = 0;
        long mod = (long) (1e9 + 7);

        for(int i=0; i<arr.length; i++) {
            int left = i - pse[i];
            int right = nse[i] - i;
            total = (total + right * left % mod * arr[i] % mod) % mod;
        }
        return (int) total;
    }

    public int[] findNSE(int[] arr) {
        int n = arr.length;
        int nse[] = new int[n];
        Stack<Integer> st = new Stack<>();

        for(int i=n-1; i>=0; i--) {
            while(!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            nse[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }
        return nse;
    }

    public int[] findPSEE(int[] arr) {
        int n = arr.length;
        int psee[] = new int[n];
        Stack<Integer> st = new Stack<>();

        for(int i=0; i<n; i++) {
            while(!st.isEmpty() && arr[st.peek()] > arr[i]) {
                st.pop();
            }
            psee[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }
        return psee;
    }
}
