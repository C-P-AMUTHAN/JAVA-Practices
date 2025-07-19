import java.util.*;
public class DecimalToBinary {
    public static void getBinary(int n) {
        int[] binary = new int[20];
        int iter = 0;
        while(n > 0) {
            binary[iter] = n % 2;
            n = n/2;
            iter++;
        }
        for(int i=iter-1; i>=0; i--) {
            System.out.print(binary[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        getBinary(n);
        sc.close();
    }
}
