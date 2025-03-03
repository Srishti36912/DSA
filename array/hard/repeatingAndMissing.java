package array.hard;
import java.util.ArrayList;

public class repeatingAndMissing {
    ArrayList<Integer> findTwoElement(int arr[]) {
        // taking every element in long to avoid overflow
        long n = arr.length;
        ArrayList<Integer> ans = new ArrayList<>();
        long SN = (n * (n + 1)) / 2;
        long S2N = (n * (n + 1) * (2 * n + 1)) / 6;
        
        long S = 0, S2 = 0;
        for(int i=0; i<n; i++) {
            S += arr[i];
            S2 += ((long)arr[i] * (long)arr[i]);
        }
        long val1 = S - SN; // x - y
        long val2 = S2 - S2N;
        val2 = val2 / val1; // x + y
        long x = (val2 + val1) / 2;
        long y = val2 - x;
        
        ans.add((int)x);
        ans.add((int)y);
        
        return ans;
    }
}
