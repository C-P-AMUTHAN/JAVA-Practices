import java.util.*;
public class OctalToDecimal {
    public static int getPower(int num, int p) {
        int result = 1;
        for(int i=0; i<p; i++) {
            result *= num;
        }
        return result;
    }
    public static void getDecimal(int n) {
        int dec = 0;
        int pow = 0;
        while(n != 0) {
            dec += (n % 10) * getPower(8, pow);
            pow++;
            n /= 10;
        }
        System.out.println(dec);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        getDecimal(n);
        sc.close();
    }
}
