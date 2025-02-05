package array.medium;

public class maxSubarray_Kadane {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        // int start = 0;
        // int ansStart = -1, ansEnd = -1;


        for(int i=0; i<nums.length; i++) {
            // if (sum == 0) start = i; // starting index
            sum = sum + nums[i];
            if(sum > max) {
                max = sum;
                // ansStart = start;
                // ansEnd = i;

            }
            if(sum < 0) {
                sum = 0;
            }
        }
        return max;

        // To consider the sum of the empty subarray
        // uncomment the following check:

        //if (maxi < 0) maxi = 0;
    }
}
