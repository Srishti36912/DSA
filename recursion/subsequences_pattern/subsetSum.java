package recursion.subsequences_pattern;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class subsetSum {
    public ArrayList<Integer> subsetSums(int[] arr) {
        // code here
        int n = arr.length;
        ArrayList<Integer> res = new ArrayList<>();
        subset(0, 0, arr, n, res);
        Collections.sort(res);
        return res;
    }
    
    private void subset(int ind, int sum, int[] arr, int n, List<Integer> res) {
        if(ind == n) {
            res.add(sum);
            return;
        }
        
        subset(ind + 1, sum + arr[ind], arr, n, res);
        
        subset(ind + 1, sum, arr, n, res);
    }
}
