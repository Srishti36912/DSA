package binarySearch.BS_on_2D;

public class rowWithMax1 {
    
    public int rowWithMax1s(int arr[][]) {
        // code here
        int n = arr.length;
        int m = arr[0].length;
        int max = 0, index = -1;
        
        for(int i=0; i<n; i++) {
            int count = m - lowerBound(arr[i], m, 1);
            
            if(count > max) {
                max = count;
                index = i;
            }
        }
        
        return index;
    }
    
    private int lowerBound(int arr[], int n, int x) {
        int low = 0, high = n - 1;
        int ans = n;
        
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
