import java.util.*;
public class NoOfDigits {
    public static void countDigit(int n) {
        int count = 0;
        while(n!=0) {
            count++;
            n = n/10;
        }
        System.out.println("The no.of.digits: "+count);
    }
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        countDigit(n);
        sc.close();
    }
}