import java.util.*;
public class codu {
    public static void main(String[] args) {

    long sum = 0;

    int N = new Scanner(System.in).nextInt();

    for (int i = 0; i < N; i++) {

    final long x = new Scanner(System.in).nextLong(); // read input

    String str = Long.toString((long) Math.pow(2, x));

    str= "0"+ str;
    str = str.substring(str.length() - 2);

    sum += Integer.parseInt(str);

    }

    System.out.println(sum % 100);


    }
}