package bitManipulation.interviewProblems;

import java.util.ArrayList;

public class twoOddNumbers {
    
    ArrayList<Integer> twoOddNum(int[] arr) {
        //code here
        int n = arr.length;
        int xor = 0;
        
        for(int i=0; i<n; i++) {
            xor = arr[i] ^ xor;
        }
        
        xor &= -xor;
        
        int ans[] = {0, 0};
        
        for(int i=0; i<n; i++) {
            int num = arr[i];
            
            if((num & xor) == 0) {
                ans[0] ^= num;
            }
            
            else {
                ans[1] ^= num;
            }
        }
        
        if(ans[0] < ans[1]) {
            int temp = ans[0];
            ans[0] = ans[1];
            ans[1] = temp;
        }
        
        ArrayList<Integer> ansFinal = new ArrayList<>();
        
        ansFinal.add(ans[0]);
        ansFinal.add(ans[1]);
        
        return ansFinal;
    }
}
