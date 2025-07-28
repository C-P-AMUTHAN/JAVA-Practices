import java.io.*;
import java.util.*;

public class SumOfFibSeries {
    public static void getSum(int s, int e) {
        if((s < 1 || s > 20) || (e < 1 || e > 20)) {
            System.out.println("Invalid Input");
            return;
        }
        int[] arr = new int[20];
        int n1 = 0;
        int n2 = 1;
        arr[0] = n1;
        arr[1] = n2;
        int i = 2, temp = 0;
        while(i < 20) {
            temp = (n1 + n2);
            arr[i] = temp;
            n1 = n2;
            n2 = temp;
            i++;
        }
        int sum = 0;
        for(int j=s-1; j<e; j++) {
            sum += arr[j];
        }
        System.out.println("The Sum of Fibonacci value is "+(double)sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int e = sc.nextInt();
        getSum(s, e);
    }
}
