import java.io.*;
import java.util.*;

public class StarPattern7 {
    public static void getPattern(int n) {
        int x = n-1;
        for(int i=0; i<n*2-1; i++) {
            for(int j=0; j<x; j++) {
                System.out.print(" ");
            }
            for(int j=x; j<n; j++) {
                System.out.print("*");
            }
            if(i < n) {
                x--;
            }else {
                x++;
            }
            if(x < 0) {
                x = 1;
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
