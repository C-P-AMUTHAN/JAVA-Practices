import java.util.*;
public class StarPattern1 {
    public static void getPattern(int n) {
        int k = 1;
        for(int i=0; i<n; i++) {
            int x = 0;
            for(int j=i; j<n-1; j++) {
                System.out.print(" ");
            }
            while(x<k) {
                if(x == 0) {
                    System.out.print("1");
                }else if(x == k-1) {
                    System.out.print("1");
                }else {
                    System.out.print((char)(x+64));
                }
                x++;
            }
            for(int j=i; j<n; j++) {
                System.out.print(" ");
            }
            k+=2;
            System.out.println();
        }
    }
    public static void main(String camp[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        getPattern(n);
        sc.close();
    }
}
