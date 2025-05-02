package stack_queue.monotonic_stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class slidingWindowMax {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int list[] = new int [n-k+1];
        int li = 0;
        Deque<Integer> q = new ArrayDeque<>();

        for(int i=0; i<n; i++) {
            if(!q.isEmpty() && q.peek() <= i-k) {
                q.poll();
            }
            while(!q.isEmpty() && nums[q.peekLast()] <= nums[i]) {
                q.pollLast();
            }
            q.offer(i);
            if(i >= k-1) {
                list[li++] = nums[q.peek()];
            }
        }
        return list;
    }
}
