package slidingWindow_twoPointers.medium;

public class binarySubarrayWithSum {
    
    public int numSubarraysWithSum(int[] nums, int goal) {
      int n = nums.length;
      int l = 0, count = 0, currSum = 0, zeros = 0;

        for(int r=0; r<n; r++) {
            currSum += nums[r];

            while(l < r && (nums[l] == 0 || currSum > goal)) {
                if(nums[l] == 1) {
                    zeros = 0;
                }
                else {
                    zeros++;
                }

                currSum -= nums[l];
                l++;
            }

            if(currSum == goal) {
                count += 1 + zeros;
            }
        } 

        return count;
    }
}
