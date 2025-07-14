package binarySearch.BS_ON_1D;

public class findFirstLastOccurrence {
    public int[] searchRange(int[] nums, int target) {
        int f = first(nums, target);
        int l = last(nums, target);
        return new int[] {f,l};
    }

    private int last(int[] nums, int target) {
        int n = nums.length;
        int start = 0, end = n - 1, res = -1;

        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(target == nums[mid]) {
                res = mid;
                start = mid + 1;
            }
            else if(target < nums[mid]) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return res;
    }

    private int first(int[] nums, int target) {
        int n = nums.length;
        int start = 0, end = n - 1, res = -1;

        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(target == nums[mid]) {
                res = mid;
                end = mid - 1;
            }
            else if(target < nums[mid]) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return res;
    }
}
