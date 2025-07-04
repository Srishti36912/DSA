package recursion.get_a_strong_hold;

public class countGoodNumbers {
    
    long mod = 1000000007;

    public int countGoodNumber(long n) {
        return (int) ((quickmul(5, (n + 1) / 2) * quickmul(4, (n / 2))) % mod);      
    }

    public long quickmul(int x, long y) {
        long ret = 1;
        long mul = x;

        while(y > 0) {
            if(y % 2 == 1) {
                ret = (ret * mul) % mod;
            }
            mul = (mul * mul) % mod;
            y /= 2;
        }
        return ret;
    }
}
