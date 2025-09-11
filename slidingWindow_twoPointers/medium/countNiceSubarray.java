package slidingWindow_twoPointers.medium;

public class countNiceSubarray {
    
    public int numberOfSubarrays(int[] nums, int k) {
       return atMost(nums, k) - atMost(nums, k-1); 
    }

    private int atMost(int nums[], int k) {
        int size = 0, subArr = 0, l = 0;

        for(int r=0; r<nums.length; r++) {
            size += nums[r] % 2;

            while(size > k) {
                size -= nums[l] % 2;
                l++;
            }

            subArr += r - l + 1;
        }

        return subArr;
    }
}
