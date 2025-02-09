package array.medium;

import java.util.HashSet;
import java.util.Set;

public class longestConsecutiveSeq {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if(n == 0) {
            return 0;
        }
        int longest = 1;
        Set<Integer> s = new HashSet<>();

        for(int i=0; i<n; i++) {
            s.add(nums[i]);
        }

        for(int it: s) {
            if(!s.contains(it-1)) {
                int count = 1;
                int x = it;
                while(s.contains(x+1)) {
                    count = count + 1;
                    x = x+1;
                }
                longest = Math.max(longest,count);
            }
        }
        return longest;
    }
}
