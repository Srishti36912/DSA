package binarySearch.BS_Answers;

public class allocateMinPages {
    
    public int findPages(int[] arr, int k) {
        // code here
        int n = arr.length;
        
        if(k > n) {
            return -1;
        }
        
        int low = arr[0], high = 0;
        for(int i=0; i<n; i++) {
            low = Math.max(arr[i], low);
            high += arr[i];
        }
        
        while(low <= high) {
            int mid = (low + high) / 2;
            int count = count(arr, mid);
            
            if(count > k) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        
        return low;
    }
    
    private int count(int arr[], int mid) {
        int n = arr.length;
        int count = 1, sum = 0;
        
        for(int i=0; i<n; i++) {
            if(sum + arr[i] <= mid) {
                sum += arr[i];
            }
            else {
                count += 1;
                sum = arr[i];
            }
        }
        
        return count;
    }
}
