import java.util.*;
public class BinaryToDecimal {
    public static void getDecimal(long n) {
        int i = 0;
        int result = 0;
        while(n > 0) {
            result += n%10 * Math.pow(2,i);
            n = n/10;
            i++;
        }
        System.out.println(result);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        getDecimal(n);
        sc.close();
    }
}