package binarySearch.BS_ON_1D;

public class findCeilIndex {
    public int findCeil(int[] arr, int x) {
        // code here
        int n = arr.length;
        int low = 0, high = n - 1, ans = -1;
        while(low <= high) {
            int mid = (low + high) / 2;
            if(arr[mid] >= x) {
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
