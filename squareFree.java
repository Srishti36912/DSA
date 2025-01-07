import java.util.*;
public class squareFree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count=0;
         int N = sc.nextInt();

         for(int i=2; i<= Math.sqrt(N); i++) {
            if (N % i == 0) {
                if(squareFree(i)) {
                    count++;
                }
                if(squareFree(N/i)) {
                    count++;
                }
            }
         }
         System.out.println(count);
    }

    public static boolean squareFree(int n) {
        
            if(n % 2 == 0) {
                n = n/2;
                if(n%2 == 0) {
                    return false;
                }
            for(int i=3; i<Math.sqrt(n); i+=2) {
                if(n%i == 0) {
                   n = n/i;
                   if(n%i == 0) {
                    return false;
                   }
                }
            }
        }
        return true;
    }
}
