import java.io.*;
import java.util.*;

public class StarPattern5 {
    public static void getPattern(int n) {
        int x = n;
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n; j++) {
                if(i == j) {
                    System.out.print("*");
                } 
                else if(j == x) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            x--;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        getPattern(n);
    }
}
