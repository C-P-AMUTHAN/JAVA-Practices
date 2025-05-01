import java.util.*;

public class GCD {
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n1 = 24;
        int n2 = 36;
        System.out.println(gcd(n1, n2)); // Output: 27
        sc.close();
    }
}
