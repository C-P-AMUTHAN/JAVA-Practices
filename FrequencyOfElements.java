import java.util.*;
public class FrequencyOfElements {
    public static void getFrequency(int n, int[] arr) {
        int max = 0;
        for(int i=0; i<n; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        int[] hash = new int[max +1];
        for(int i=0; i<n; i++) {
            hash[arr[i]]++;
        }
        for(int i=0; i<max+1; i++) {
            if(hash[i] > 0) {
                System.out.println(i+":"+hash[i]);
            } 
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        getFrequency(n, arr);
        sc.close();
    }
}
