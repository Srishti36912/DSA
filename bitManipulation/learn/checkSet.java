package bitManipulation.learn;

public class checkSet {
    
    static boolean checkKthBit(int n, int k) {
        // code here
        if ((n &(1<<k)) != 0) {
            return true;
        }
        else {
            return false;
        }
    }
}
