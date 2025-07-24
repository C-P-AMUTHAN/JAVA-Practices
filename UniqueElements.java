import java.util.*;

public class UniqueElements {
    public static void getUnique(int n, int[] arr) {
        HashMap <Integer, Integer> map = new HashMap<>();
        for(int num : arr) {
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        int count = 0;
        for(Map.Entry<Integer, Integer> entry:map.entrySet()) {
            if(entry.getValue() == 1) {
                System.out.println(entry.getKey());
                count++;
            }
        }
        System.out.println("Count of unique elements: "+count);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        getUnique(n, arr);
        sc.close();
    }
}

// Getting the unique elements present in the array using HashMap