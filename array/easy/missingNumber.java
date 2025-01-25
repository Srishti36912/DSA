package array.easy;

public class missingNumber {
    public int missingNumber(int[] nums) {
        int l = nums.length;
        int sum2 = 0;
        int sum1 = (l * (l+1))/2;

        for(int i=0; i<l; i++) {
            sum2 = sum2 + nums[i];
        }
        return (sum1 - sum2);
    }
}
