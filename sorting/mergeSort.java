package sorting;

import java.util.ArrayList;

public class MergeSort {
    void mergeSort(int arr[], int l, int r) {
        // code here
        if(l >=r) {
            return;
        }
        int mid = (l + r)/2;
        mergeSort(arr, l, mid);
        mergeSort(arr, mid+1, r);
        
        ArrayList<Integer> temp = new ArrayList<>();
        int left = l;
        int right = mid + 1;
        
        while(left <= mid && right <=r) {
            if(arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }
        
        while(left <= mid) {
            temp.add(arr[left]);
            left++;
        }
        
        while(right <= r) {
            temp.add(arr[right]);
            right++;
        }
        
        for(int i=l; i<=r; i++) {
            arr[i] = temp.get(i-l);
        }
    }
}
