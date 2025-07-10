import java.util.*;
public class StrongNumber {
    public static int getFact(int num) {
        if(num == 1) {
            return num;
        }
        return num * getFact(num - 1);
    }
    public static void isStrongNumber(int n) {
        int temp = n;
        int result = 0;
        while(n != 0) {
            int fact = getFact(n%10);
            result += fact;
            n = n/10;
        }
        if(temp == result) {
            System.out.println(temp+" is a Strong number");
        }else {
            System.out.println(temp+" is not a Strong number");
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        isStrongNumber(n);
        sc.close();
    }
}