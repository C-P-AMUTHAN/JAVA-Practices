import java.util.*;
public class SequencePrimeNumbers {
    public static boolean isPrime(int i) {
        for(int j=2; j<=i/2; j++) {
            if(i % j == 0) {
                return false;
            }
        }
        return true;
    }
    public static void seqPrime(int n) {
        for(int i=2; i<=n; i++) {
            if(isPrime(i)) {
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        seqPrime(n);
        sc.close();
    }
}