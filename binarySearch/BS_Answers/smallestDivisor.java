package binarySearch.BS_Answers;

public class smallestDivisor {
    
    public int smallestDivisor(int[] nums, int threshold) {
        int n = nums.length;
        
        if(n > threshold) {
            return -1;
        }

        int maxi = Integer.MIN_VALUE;

        for(int i=0; i<n; i++) {
            maxi = Math.max(maxi, nums[i]);
        }

        int low = 0, high = maxi;

        while(low <= high) {
            int mid = (low + high) / 2;

            if(sumByD(nums, mid) <= threshold) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }

        return low;
    }

    private int sumByD(int nums[], int val) {
        int n = nums.length;
        int sum = 0;

        for(int i=0; i<n; i++) {
            sum += Math.ceil((double) nums[i] / (double) val);
        }

        return sum;
    }
}
