import java.util.*;

public class RemoveDuplicates {
    public static void removeDuplicates(int n, int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : arr) {
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        System.out.println(map.keySet());
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        removeDuplicates(n, arr);
        sc.close();
    }
}

// Printing the unique elements of the array using HashMap