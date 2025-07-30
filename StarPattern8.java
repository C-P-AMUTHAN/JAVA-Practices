import java.io.*;
import java.util.*;

public class StarPattern8 {
    public static void getPattern(int n) {
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(j == 0 || j == n-1) {
                    System.out.print("+");
                }else if(i == n/2 && (j > 0 && j < n-1)) {
                    System.out.print("$");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        getPattern(n);
    }
}
