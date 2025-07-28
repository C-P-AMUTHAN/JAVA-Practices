import java.io.*;
import java.util.*;

public class NeonNumber {

    public static void isNeon(int n) {
        if(n > 9) {
            System.out.println("Invalid Input");
            return;
        }
        int sqr = n * n;
        int sum = 0;
        while(sqr != 0) {
            sum += sqr%10;
            sqr/=10;
        }
        if(sum == n) {
            System.out.printf("%03d is a Neon Number.",n);
        }else {
            System.out.printf("%04d is not a Neon Number.",n);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        isNeon(n);
    }
}
