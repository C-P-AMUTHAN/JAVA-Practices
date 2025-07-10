import java.util.*;
public class PosOrNeg {
    public static void isPosOrNeg(int n) {
        if(n == 0) {
            System.out.println(n+" is zero");
        } else if(n > 0) {
            System.out.println(n+" is positive");
        }else {
            System.out.println(n+" is negative");
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        isPosOrNeg(n);
        sc.close();
    }
}