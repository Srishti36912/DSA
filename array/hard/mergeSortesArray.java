package array.hard;

import java.util.Arrays;

public class mergeSortesArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int left = m - 1;
        int right = 0;

        while(left >= 0 && right < n) {
            if(nums1[left] > nums2[right] || nums1[left] >= 0) {
                int temp = nums1[left];
                nums1[left] = nums2[right];
                nums2[right] = temp;
                left--;
                right++;
            }
            else {
                break;
            }
        }
        Arrays.sort(nums1);
        Arrays.sort(nums1);
    }

    // if we have to return only the nums1 array and remove 0s from it
    
    public void mergeForNums1(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1, j = n - 1, k = n + m - 1;

        while(i >= 0 && j >= 0) {
            if(nums1[i] >= nums2[j]) {
                nums1[k] = nums1[i];
                k--;
                i--;
            }
            else {
                nums1[k] = nums2[j];
                k--;
                j--;
            }
        }
        while(j >= 0) {
            nums1[k] = nums2[j];
            k--;
            j--;
        }
    }
}
