package string.hard;

import java.util.ArrayList;
import java.util.List;

public class zFunction {
    public List<Integer> matchPattern(char text[], char pattern[]) {
        char newString[] = new char[text.length + pattern.length + 1];
        int i = 0;
        for(char ch : pattern) {
            newString[i] = ch;
            i++;
        }
        newString[i] = '$';
        i++;
        for(char ch : text) {
            newString[i] = ch;
            i++;
        }
        List<Integer> result = new ArrayList<>();
        int z[] = calculateZ(newString);
        for(int j = 0; j < z.length; j++) {
            if(z[j] == pattern.length) {
                result.add(j - pattern.length - 1);
            }
        }
        return result;
    }

    private int[] calculateZ(char str[]) {
        int z[] = new int[str.length];
        int left = 0, right = 0;
        for(int i = 1; i < str.length; i++) {
            if(i > right) {
                left = right = i;
                while(right < str.length && str[right] == str[right - left]) {
                    right++;
                }
                z[i] = right - left;
                right--;
            } else {
                int k = i - left;
                if(z[k] < right - i + 1) {
                    z[i] = z[k];
                } else {
                    left = i;
                    while(right < str.length && str[right] == str[right - left]) {
                        right++;
                    }
                    z[i] = right - left;
                    right--;
                }
            }
        }
        return z;
    }
    public static void main(String[] args) {
        String text = "aaabcxyzaaaabczaaczabbaaaaaabc";
        String pattern = "aaabc";
        zFunction zFunction = new zFunction();
        List<Integer> result = zFunction.matchPattern(text.toCharArray(), pattern.toCharArray());
        result.forEach(System.out::println);
    }
}
