import java.io.*;
import java.util.*;

public class  StarPattern4{
    public static void getPattern(int n) {
        int x = 1;
        for(int i=0; i<n-1; i++) {
            for(int j=i; j<n-1; j++) {
                System.out.print(" ");
            }
            for(int k=0; k<x; k++) {
                if(k == 0 || k == x-1) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            for(int j=i; j<n; j++) {
                System.out.print(" ");
            }
            x=x+2;
            System.out.println();
        }
        x = n*2-1;
        for(int i=0; i<n; i++) {
            for(int j=0; j<i; j++) {
                System.out.print(" ");
            }
            for(int k=0; k<x; k++) {
                if(k == 0 || k == x-1) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            for(int j=0; j<i; j++) {
                System.out.print(" ");
            }
            x=x-2;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        getPattern(n);
    }
}
