import java.util.*;

public class ArmstrongNumber {
    public static int countDigit(int n) {
        return (n == 0) ? 1 : (int) Math.log10(n) + 1; // Faster way to count digits
    }

    public static boolean isArmstrong(int n) {
        int copy = n;  
        double armNumber = 0;  // Use double for storing the result of Math.pow()
        int digits = countDigit(n);
        
        while (n != 0) {
            int rem = n % 10;
            armNumber += Math.pow(rem, digits);  // Directly add the result of Math.pow()
            n /= 10;
        }
        
        return copy == armNumber;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isArmstrong(n));
        sc.close();
    }
}
