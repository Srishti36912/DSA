public class nextGreaterElement {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> m = new HashMap<>();
        Stack<Integer> st = new Stack<>();
        int n = nums1.length;
        int nge[] = new int[n];
        for(int i=nums2.length-1; i>=0; i++) {
            while(! st.empty() && st.peek() < nums1[i]) {
                st.pop();
            }
            if(st.empty()) {
                m[nums2[i]] = -1;
            }
            else {
                m[nums2[i]] = st.peek();
            }
            st.push(nums2[i]);
        }
        for(int i=0; i<n; i++) {
            nge[i] = map
        }
        return nge;
    }
}
