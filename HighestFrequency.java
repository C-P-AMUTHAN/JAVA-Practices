import java.util.*;

public class HighestFrequency {
    public static void getHighFrequency(int n, int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : arr) {
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        int max = Integer.MIN_VALUE;
        int key = Integer.MIN_VALUE;
        for(Map.Entry<Integer, Integer> entry :map.entrySet()) {
            if(entry.getValue() > max) {
                max = entry.getValue();
                key = entry.getKey();
            }
        }
        System.out.println(key);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        getHighFrequency(n, arr);
        sc.close();
    }
}

// Getting the highest frequency of element present in an array using HashMap