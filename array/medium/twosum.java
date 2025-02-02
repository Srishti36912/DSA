package array.medium;

import java.util.*;
public class twosum {
    public int[] twoSum(int[] nums, int target) {
        int idx[] = new int[2];
        idx[0] = idx[1] = -1;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            int num = nums[i];
            int more = target - num;
            if(map.containsKey(more)) {
                idx[0] = map.get(more);
                idx[1] = i;
                return idx;
            }
            map.put(nums[i],i);
        }
        return idx;
    }
}
