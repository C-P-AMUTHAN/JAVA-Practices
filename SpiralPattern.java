import java.io.*;
import java.util.*;

public class SpiralPattern {
    public static void getPattern(String str) {
        int n = str.length();
        int f = 1, l = n-2, la = n-1;
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(i == 0) {
                    System.out.print(str.charAt(j));
                }
                else if(i == n-1) {
                    System.out.print(str.charAt(la));
                    la--;
                }
                else if(j == 0) {
                    System.out.print(str.charAt(f));
                    f++;
                }
                else if(j == n-1) {
                    System.out.print(str.charAt(l));
                    l--;
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        getPattern(str);
    }
}
