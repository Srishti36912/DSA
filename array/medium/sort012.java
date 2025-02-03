package array.medium;

public class sort012 {
    public void sortColors(int[] nums) {
        int n = nums.length;
       int low = 0, mid = 0, high = n - 1;
       while(mid <= high) {
        if(nums[mid] == 0) {
            int temp = nums[low];
            nums[low] = nums[mid];
            nums[mid] = temp;
            mid++;
            low++;
        } 
        else if(nums[mid] == 1) {
            mid++;
        } else {
            int temp = nums[mid];
            nums[mid] = nums[high];
            nums[high] = temp;
            high--;
        }
       }
    }
}
