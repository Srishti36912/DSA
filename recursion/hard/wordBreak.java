package recursion.hard;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class wordBreak {
    public boolean wordBreak(String s, List<String> wordDict) {
        return wordBreakRecur(s, new HashSet < > (wordDict), 0);
    }

    private boolean wordBreakRecur(String s, HashSet<String> wordDict, int start) {
        if(start == s.length()) {
            return true;
        }
        for(int end=start+1; end<=s.length(); end++) {
            if(wordDict.contains(s.substring(start, end)) && 
            wordBreakRecur(s, wordDict, end)) {
                return true;
            }
        }
        return false;
    }
}
