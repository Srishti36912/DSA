package bitManipulation.advancedMaths;

import java.util.ArrayList;

public class primeFactors {
    
    public static ArrayList<Integer> primeFac(int n) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        
        for(int i=2; i<=n; i++) {
            if(n % i == 0) {
                result.add(i);
            }
            
            while(n % i == 0) {
            n = n / i;
            }
        }
        
        return result;
    }
}
