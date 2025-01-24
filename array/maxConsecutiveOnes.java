package array;
public class maxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int num = 0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] == 1) {
                count++;
                if(num < count) {
                    num = count;
                }
            } else {
                count = 0;
            }   
        }
        return num;
    }
}
