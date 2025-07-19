import java.util.*;
public class SumOfAllNumbers {
    public static void getSum(int n) {
        System.out.println((n * (n+1)) / 2); // formula method
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        getSum(n);
        sc.close();
    }
}