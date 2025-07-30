import java.io.*;
import java.util.*;

public class StarPattern6 {
    public static void getPattern(int n) {
        int x = n*2-2;
        int ch = 64;
        for(int i=0; i<n; i++) {
            for(int j=0; j<n*2-1; j++) {
                if(i == 0) {
                    System.out.print("*");
                }else if(i == j || j == x) {
                    System.out.print("*");
                }else if(j>i && j<x){
                    System.out.print((char)(ch));
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            x--;
            ch++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        getPattern(n);
    }
}
