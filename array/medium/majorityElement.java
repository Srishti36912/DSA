package array.medium;

public class majorityElement {
    public int majorityElement(int[] nums) {
        int el = 0;
        int count = 0;
        for(int i=0; i<nums.length; i++) {
            if(count == 0) {
                el = nums[i];
                count = 1;
            }
            else if(nums[i] == el) {
                count++;
            }
            else {
                count--;
            }
        }
        int count1 = 0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] == el) {
                count1++;
            }
        }
        if(count1 > nums.length/2) {
            return el;
        }
        return -1;
    }
}
