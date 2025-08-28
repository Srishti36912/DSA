package bitManipulation.advancedMaths;

import java.util.ArrayList;
import java.util.Collections;

public class allDivisors {
    
    public static void print_divisors(int n) {
        ArrayList<Integer> ans = new ArrayList<>();
        int sqrtN = (int) Math.sqrt(n);
        
        for(int i=1; i<=sqrtN; i++) {
            if(n % i == 0) {
                ans.add(i);
                
                if(i != n/i) {
                    ans.add(n/i);
                }
            }
        }
        
        Collections.sort(ans);
        
        for(int divisor: ans) {
            System.out.print(divisor + " ");
        }
    }
}
