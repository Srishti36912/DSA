package string.easy;

public class anagram {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }

        int freq[] = new int[26];
        
        for(int i=0; i<s.length(); i++) {
            freq[s.charAt(i) - 'a']++; // since the characters are lowercase letters otherwise use 'A' for uppercase letters
        }
        for(int i=0; i<t.length(); i++) {
            freq[t.charAt(i) - 'a']--;
        }

        for(int i=0; i<26; i++) {
            if(freq[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
