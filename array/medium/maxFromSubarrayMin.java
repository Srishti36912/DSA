package array.medium;

public class maxFromSubarrayMin {
    public int pairWithMaxSum(int arr[]) {
        // Your code goes here
        int n = arr.length;
        int sum = 0;
        int maxi = Integer.MIN_VALUE;
        
        if(n < 2) {
            return -1;
        }
        
        for(int i=0; i<n-1; i++) {
            sum = arr[i] + arr[i+1];
            maxi = Math.max(sum,maxi);
        }
        
        return maxi;
    }
}
