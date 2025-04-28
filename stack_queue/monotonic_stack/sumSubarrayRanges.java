package stack_queue.monotonic_stack;

import java.util.Stack;

public class sumSubarrayRanges {
    public long subArrayRanges(int[] nums) {
        return sumMax(nums) - sumMin(nums);
    }

    public long sumMin(int[] arr) {
        int nse[] = findNSE(arr);
        int psee[] = findPSEE(arr);
        long total = 0;

        for(int i=0; i<arr.length; i++) {
            long left = i - psee[i];
            long right = nse[i] - i;
            total = (total + left * right * arr[i]);
        }
        return total;
    }

    public long sumMax(int arr[]) {
        int nge[] = findNGE(arr);
        int pgee[] = findPGEE(arr);
        long total = 0;

        for(int i=0; i<arr.length; i++) {
            long left = i - pgee[i];
            long right = nge[i] - i;
            total = (total + left * right * arr[i]);
        }
        return total;
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
    public int[] findNGE(int[] arr) {
        int n = arr.length;
        int nge[] = new int[n];
        Stack<Integer> st = new Stack<>();

        for(int i=n-1; i>=0; i--) {
            while(!st.isEmpty() && arr[st.peek()] <= arr[i]) {
                st.pop();
            }
            nge[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }
        return nge;
    }

    public int[] findPGEE(int[] arr) {
        int n = arr.length;
        int pgee[] = new int[n];
        Stack<Integer> st = new Stack<>();

        for(int i=0; i<n; i++) {
            while(!st.isEmpty() && arr[st.peek()] < arr[i]) {
                st.pop();
            }
            pgee[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }
        return pgee;
    }
}
