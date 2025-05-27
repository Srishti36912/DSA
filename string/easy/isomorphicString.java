package string.easy;

import java.util.HashMap;
import java.util.HashSet;

public class isomorphicString {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Character> hm = new HashMap<>();
        HashSet<Character> mapped = new HashSet<>();
        for(int i=0; i<s.length(); i++) {
            if(hm.containsKey(s.charAt(i))) {
                if(hm.get(s.charAt(i)) != t.charAt(i)) {
                    return false;
                }
            }
            else {
                if(mapped.contains(t.charAt(i))) {
                    return false;
                }
                hm.put(s.charAt(i), t.charAt(i));
                mapped.add(t.charAt(i));
            }
        }
        return true;
    }
}
