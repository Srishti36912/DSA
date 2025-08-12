package bitManipulation.learn;

public class checkOdd {
    
    static boolean isOdd(int n) {
        // code here
        int a = n&1;
        return (a == 1) ? true : false;
    }
}
