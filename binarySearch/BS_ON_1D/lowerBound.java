package binarySearch.BS_ON_1D;

public class lowerBound {
    int lowerbound(int[] arr, int target) {
        // code here
        int n = arr.length;
        int low = 0, high = n - 1;
        int ans = n;
        
        while(low <= high) {
            int mid = (low + high) / 2;
            if(arr[mid] >= target) {
                ans = mid;
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return ans;
    }
}
