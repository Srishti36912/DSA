package stack_queue.monotonic_stack;

import java.util.Stack;

public class NumberOfNGEtoRight {
    public static int[] count_NGEs(int N, int arr[], int queries, int indices[]) {
        // code here
        Stack<Integer> asc = new Stack<>();
        Stack<Integer> desc = new Stack<>();
        int v[] = new int[N];
        int ans[] = new int[queries];
        
        for(int i=N-1; i>=0; i--) {
            while(!asc.isEmpty() && arr[i] >= asc.peek()) {
                desc.push(asc.pop());
            }
            desc.push(arr[i]);
            v[i] = asc.size();
            
            while(!desc.isEmpty()) {
                asc.push(desc.pop());
            }
        }
        
        for(int i=0; i<queries; i++) {
            ans[i] = v[indices[i]];
        }
        
        return ans;
    }
}
