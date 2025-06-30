package recursion.subsequences_pattern;

public class countSubseqWithSumK {
     public int countSubsequenceWithTargetSum(int[] nums, int k) {
        //your code goes here
         int n = nums.length;

        int count = findCount(0, nums, k, 0, n);
        return count;
    }

    private int findCount(int ind, int nums[], int k, int s, int n) {
        if(ind == n) {
            if(s == k) {
                return 1;
            } else {
                return 0;
            }
        }
        int l = findCount(ind + 1, nums, k, s + nums[ind], n);
        int r = findCount(ind + 1, nums, k, s, n);

        return l + r;
    }
}
