import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstUniqueElement {
    public static void getFirstUnique(int n, int[] arr) {
        HashMap <Integer, Integer> map = new HashMap<>();
        for(int num : arr) {
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        for(Map.Entry<Integer, Integer> entry:map.entrySet()) {
            if(entry.getValue() == 1) {
                System.out.println(entry.getKey());
                break;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        getFirstUnique(n, arr);
        sc.close();
    }
}

// Getting the first unique element of the array using HashMap