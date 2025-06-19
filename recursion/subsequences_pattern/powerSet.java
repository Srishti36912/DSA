package recursion.subsequences_pattern;

import java.util.ArrayList;
import java.util.List;

public class powerSet {
    private List<List<Integer>> output = new ArrayList<>();
    private int n;

    public List<List<Integer>> subsets(int[] nums) {
        n = nums.length;
        ArrayList<Integer> f = new ArrayList<>();
        backtrack(0, f, nums);
        return output;
    }

    private void backtrack(int first, ArrayList<Integer> curr, int nums[]) {
        output.add(new ArrayList(curr));
        for(int i=first; i<n ;i++) {
            curr.add(nums[i]);
            backtrack(i + 1, curr, nums);
            curr.remove(curr.size() - 1);
        }
    }
}
