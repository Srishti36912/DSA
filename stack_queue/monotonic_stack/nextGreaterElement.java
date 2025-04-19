package stack_queue.monotonic_stack;

public class nextGreaterElement {
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
}
