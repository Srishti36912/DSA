package recursion.subsequences_pattern;

import java.util.ArrayList;
import java.util.List;

public class generateBinaryStrings {
    public static List<String> generateBinaryStrings(int n) {
        // code here
        List<String> res = new ArrayList<>();
        findCombinations("", n, res);
        return res;
    }
    
    public static void findCombinations(String s, int n, List<String> res) {
        if(s.length() == n) {
            res.add(s);
            return;
        }
        
        findCombinations(s + "0", n, res);
        
        if(s.isEmpty() || s.charAt(s.length() - 1) != '1') {
            findCombinations(s + "1", n, res);
        }
    }
}
