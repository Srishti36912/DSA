package array.hard;

import java.util.ArrayList;
import java.util.List;

public class majorityElementBy3 {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        int el1 = Integer.MIN_VALUE, el2 = Integer.MIN_VALUE;
        int count1 = 0, count2 = 0;
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0; i<n; i++) { 
            if(el2 != nums[i] && count1 == 0) {
                count1++;
                el1 = nums[i];
            }
            else if(el1 != nums[i] && count2 == 0) {
                count2++;
                el2 = nums[i];
            }
            else if(nums[i] == el1) {
                count1++;
            }
            else if(nums[i] == el2) {
                count2++;
            }
            else {
                count1--;
                count2--;
            }
            
        }
        int main_count1 = 0;
        int main_count2 = 0;
        for(int i=0; i<n; i++) {
            if(nums[i] == el1) {
                main_count1++;
            }
            if(nums[i] == el2) {
                main_count2++;
            }
        }
        int mini = (int)(n/3);
        if(main_count1 > mini) {
            list.add(el1);
        }
        if(main_count2 > mini) {
            list.add(el2);
        }
        return list;
    }
}
