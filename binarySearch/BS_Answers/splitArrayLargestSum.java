package binarySearch.BS_Answers;

public class splitArrayLargestSum {
    
    public int splitArray(int[] nums, int k) {
        int low = nums[0], high = 0;

        for(int i=0; i<nums.length; i++) {
            low = Math.max(low, nums[i]);
            high += nums[i];
        }

        while(low <= high) {
            int mid = (low + high) / 2;
            int partition = countPartition(nums, mid);

            if(partition > k) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return low;
    }

    private int countPartition(int nums[], int maxSum) {
        int n = nums.length;
        int partition = 1;
        int sum = 0;

        for(int i=0; i<n; i++) {
            if(sum + nums[i] <= maxSum) {
                sum += nums[i];
            }
            else {
                partition++;
                sum = nums[i];
            }
        }
        return partition;
    }
}
