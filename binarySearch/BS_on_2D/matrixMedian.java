package binarySearch.BS_on_2D;

public class matrixMedian {
    
     public int median(int[][] mat) {
        // code here
        int n = mat.length, m = mat[0].length;
        int low = Integer.MAX_VALUE, high = Integer.MIN_VALUE;
        
        for(int i=0; i<n; i++) {
            low = Math.min(low, mat[i][0]);
            high = Math.max(high, mat[i][m - 1]);
        }
        
        int req = (m * n) / 2;
        while(low <= high) {
            int mid = (low + high) / 2;
            int small = countSmall(mat, n, m, mid);
            
            if(small <= req) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        
        return low;
    }
    
    private int countSmall(int mat[][], int n, int m, int mid) {
        int count = 0;
        
        for(int i=0; i<n; i++) {
            count += upperBound(mat[i], mid, m);
        }
        return count;
    }
    
    private int upperBound(int mat[], int x, int m) {
        int low = 0, high = m - 1, ans = m;
        
        while(low <= high) {
            int mid = (low + high) / 2;
            
            if(mat[mid] > x) {
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
