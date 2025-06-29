package recursion.subsequences_pattern;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class letterCombinations {
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();

        if(digits == null || digits.length() == 0) {
            return res;
        }
        HashMap<Character,String> letters = new HashMap<>();
        letters.put('2', "abc");
        letters.put('3', "def");
        letters.put('4', "ghi");
        letters.put('5', "jkl");
        letters.put('6', "mno");
        letters.put('7', "pqrs");
        letters.put('8', "tuv");
        letters.put('9', "wxyz");

        findCombo(digits, 0, new StringBuilder(), res, letters);
        return res;
    }

    private void findCombo(String digits, int ind, StringBuilder combo, List<String> res,
    HashMap<Character, String> letters) {
        if(ind == digits.length()) {
            res.add(combo.toString());
            return;
        }
        String let = letters.get(digits.charAt(ind));
        for(char letter : let.toCharArray()) {
            combo.append(letter);
            findCombo(digits, ind + 1, combo, res, letters);
            combo.deleteCharAt(combo.length() - 1);
        }
    }
}
