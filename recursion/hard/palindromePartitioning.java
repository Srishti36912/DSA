package recursion.hard;

import java.util.ArrayList;
import java.util.List;

public class palindromePartitioning {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        List<String> ds = new ArrayList<>();
        partition(0, s, res, ds);
        return res;
    }

    private void partition(int ind, String s, List<List<String>> res, List<String> ds) {
        if(ind == s.length()) {
            res.add(new ArrayList<>(ds));
            return;
        }

        for(int i=ind; i<s.length(); i++) {
            if(isPalindrome(s, ind, i)) {
                ds.add(s.substring(ind, i + 1));
                partition(i + 1, s, res, ds);
                ds.remove(ds.size() - 1);
            }
        }
    }

    private boolean isPalindrome(String s, int start, int end) {
        while(start <= end) {
            if(s.charAt(start++) != s.charAt(end--)) {
                return false;
            }
        }
        return true;
    }
}
