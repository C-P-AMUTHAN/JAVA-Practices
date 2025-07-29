import java.util.*;

public class StarPattern2 {
    public static void getPattern(int n) {
        int k =1;
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(i == 0 || i == n-1 || j == 0 || j == n-1) {
                    System.out.print("* ");
                }
                else {
                    System.out.print(k+" ");
                    k++;
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        getPattern(n);
        sc.close();
    }
}
