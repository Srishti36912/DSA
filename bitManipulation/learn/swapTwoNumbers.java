package bitManipulation.learn;

import java.util.List;

public class swapTwoNumbers {
    
    static List<Integer> get(int a, int b) {
        // code here
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        
        return List.of(a, b);
    }
}
