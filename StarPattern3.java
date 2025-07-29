import java.io.*;
import java.util.*;

public class StarPattern3 {
    public static void getPattern(int n) {
        int x = n*2;
        for(int i=0; i<n-1; i++) {
            for(int j=0; j<i; j++) {
                System.out.print(" ");
            }
            for(int k=0; k<x-1; k++) {
                System.out.print("*");
            }
            for(int j=0; j<i; j++) {
                System.out.print(" ");
            }
            x=x-2;
            System.out.println();
        }
        x=1;
        for(int i=0; i<n; i++) {
            for(int j=i; j<n-1; j++) {
                System.out.print(" ");
            }
            for(int k=0; k<x; k++) {
                System.out.print("*");
            }
            for(int j=i; j<n; j++) {
                System.out.print(" ");
            }
            x=x+2;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        getPattern(n);
    }
}
