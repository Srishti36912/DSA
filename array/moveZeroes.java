public class moveZeroes {
    public void moveZeroes(int[] nums) {
        for(int i=0; i<nums.length; i++) {
            for(int j=i+1; j<nums.length; j++) {
                if(nums[j] != 0 && nums[i] == 0) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
            }
            }
        }
    }
}
