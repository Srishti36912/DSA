package binarySearch.BS_ON_1D;

public class FindXinSortedArray {
    public int search(int[] nums, int target) {
       return binarySearch(nums, 0, nums.length - 1, target); 
    }

    private int binarySearch(int nums[], int low, int high, int target) {
        if(low > high) {
            return -1;
        }

        int mid = (low + high) / 2;
        if(nums[mid] == target) {
            return mid;
        }
        else if(target > nums[mid]) {
            return binarySearch(nums, mid + 1, high, target);
        }
        return binarySearch(nums, low, mid - 1, target);
    }
}
