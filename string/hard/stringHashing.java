package string.hard;

public class stringHashing {

    // Function to find hash of a string using polynomial rolling hash function
    static long findHash(String s) {
        int n = s.length();

        // p is a prime number
        // m is a large prime number
        long p = 31, m = (long) 1e9 + 7;

        // to store hash value
        long hashVal = 0;

        // to store p^i
        long pPow = 1;

        // Calculating hash value
        for (int i = 0; i < n; ++i) {
            hashVal = (hashVal + (s.charAt(i) - 'a' + 1) * pPow) % m;
            pPow = (pPow * p) % m;
        }
        return hashVal;
    }

    public static void main(String[] args) {
        String s = "geeksforgeeks";
        System.out.println(findHash(s));
    }
}
