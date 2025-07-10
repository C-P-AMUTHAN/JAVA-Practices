import java.util.*;
public class PerfectNumber {
    public static void isPerfectNumber(int n) {
        int sum = 0;
        for(int i=1; i<=n/2; i++) {
            if(n % i == 0) {
                sum += i;
            }
        }
        if(sum == n) {
            System.out.println(n+" is a perfect number");
        }else {
            System.out.println(n+" is not a perfect number");
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        isPerfectNumber(n);
        sc.close();
    }
}