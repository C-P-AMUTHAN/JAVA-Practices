import java.util.*;
public class DecimalToOctal {
    public static void getOctal(int n) {
        int oct = 0;
        int iter = 1;
        while(n != 0) {
            oct += (n % 8) * iter;
            iter = iter * 10;
            n /= 8;
        }
        System.out.println(oct);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        getOctal(n);
        sc.close();
    }
}
