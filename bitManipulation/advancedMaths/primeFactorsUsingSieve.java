package bitManipulation.advancedMaths;

import java.util.ArrayList;
import java.util.List;

public class primeFactorsUsingSieve {
    static final int MAXN = 200000;
    static int spf[] = new int[MAXN+1];
    
    static void sieve() {
        // spf[0] = 0;
        // spf[1] = 1;
        
        for(int i=1; i<=MAXN; i++) {
            spf[i] = i;
        }
        
        for(int i=2; i*i<MAXN; i++) {
            if(spf[i] == i) {
                for(int j=i*i; j<=MAXN; j+=i) {
                    if(spf[j] == j) {
                      spf[j] = i;  
                    }
                }
            }
        }
    }

    static List<Integer> findPrimeFactors(int N) {
        // code here
        List<Integer> ret = new ArrayList<>();
        
        while(N > 1) {
            ret.add(spf[N]);
            N = N / spf[N];
        }
        
        return ret;
    }
}
