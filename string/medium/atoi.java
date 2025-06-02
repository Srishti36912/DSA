package string.medium;

public class atoi {
    public int myAtoi(String s) {
        s = s.trim();
        int sign = 1, i = 0;
        long res = 0;

        if(s.length() == 0) {
            return 0;
        }

        if(s.charAt(i) == '-') {
            sign = -1;
            i++;
        }
        else if(s.charAt(i) == '+') {
            i++;
        }

        while(i < s.length()) {
            if(s.charAt(i) < '0' || s.charAt(i) > '9') {
                break;
            }

            res = res * 10 + (s.charAt(i) -'0');
            if(sign * res > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            if(sign * res < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
            i++;
        }
        return (int) (sign * res);
    }
}
