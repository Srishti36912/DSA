package stack_queue.monotonic_stack;

import java.util.HashMap;
import java.util.Stack;

public class nextGreaterElement {
    // when given 2 arrays
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> m = new HashMap<>();
        Stack<Integer> st = new Stack<>();
        int n = nums1.length;
        int nge[] = new int[n];
        for(int num : nums2) {
            while(!st.isEmpty() &&  num > st.peek()) {
                m.put(st.pop(), num);
            }
            st.push(num);
        }
        for(int i=0; i<n; i++) {
            nge[i] = m.getOrDefault(nums1[i], -1);
        }
        return nge;
    }

    // when given 1 array
    public static int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int nge[] = new int[n];
        Stack < Integer > st = new Stack < > ();
        for (int i = 2 * n - 1; i >= 0; i--) {
            while (st.isEmpty() == false && st.peek() <= nums[i % n]) {
                st.pop();
            }

            if (i < n) {
                if (st.isEmpty() == false) nge[i] = st.peek();
                else nge[i] = -1;
            }

            st.push(nums[i % n]);
        }
        return nge;
    }
}
