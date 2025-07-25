import java.util.*;
public class ReverseDigits {

    public static void Reverse_Digits(int n) {
        int reverse = 0;
        while(n != 0) {
            int rem = n % 10;
            reverse = (reverse * 10) + rem;
            n = n/10;
        }
        System.out.println("The reversed number is "+reverse);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Reverse_Digits(n);
        sc.close();
    }

}