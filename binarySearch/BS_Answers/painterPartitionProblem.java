package binarySearch.BS_Answers;

public class painterPartitionProblem {
    
    public int minTime(int[] arr, int k) {
        // code here
        int n = arr.length;
        int low = arr[0], high = 0;
        
        for(int i=0; i<n; i++) {
            low = Math.max(low, arr[i]);
            high += arr[i];
        }
        
        while(low <= high) {
            int mid = (low + high) / 2;
            int count = countPainters(arr, mid);
            
            if(count > k) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return low;
    }
    
    private int countPainters(int[] arr, int mid) {
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
