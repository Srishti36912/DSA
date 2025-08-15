package bitManipulation.learn;

public class setRightmostUnsetBit {

    static int setBit(int n) {
        // code here
        n = n | n+1;
        return n;
    }
}
