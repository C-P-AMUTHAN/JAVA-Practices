import java.io.*;
import java.util.*;

public class KTarget {
    public static void getRepititionCount(int n, int k, int[] arr) {
        int count = 0;
        for(int i : arr) {
            if(i == k) {
                count++;
            }
        }
        System.out.println(count-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        getRepititionCount(n, k, arr);
    }
}
