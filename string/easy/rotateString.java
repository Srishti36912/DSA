package string.easy;

public class rotateString {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()) {
            return false;
        }

        String doubledString = s + s;

        return doubledString.contains(goal);
    }
}
