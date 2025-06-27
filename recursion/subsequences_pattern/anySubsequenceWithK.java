package recursion.subsequences_pattern;

import java.util.ArrayList;

public class anySubsequenceWithK {
     public static boolean checkSubsequenceSum(int N, int[] arr, int K) {
        // code here
        ArrayList<Integer> ds = new ArrayList<>();
        boolean ans = checkSum(0, N, arr, K, 0);
        return ans;
    }
    
    public static boolean checkSum(int ind, int N, int arr[], int K, int s) {
        
        if(s > K) {
            return false;
        }
        
        if(ind == N) {
            if(s == K) {
                return true;
            }
            else 
            return false;
        }
        
        if(checkSum(ind + 1, N, arr, K, s + arr[ind]) == true) {
            return true;
        }
        
        if(checkSum(ind + 1, N, arr, K, s) == true) {
            return true;
        }
        
        return false;
    }
}
