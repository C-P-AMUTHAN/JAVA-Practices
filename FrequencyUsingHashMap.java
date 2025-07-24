import java.util.*;
public class FrequencyUsingHashMap {
    public static void getFrequency(int n, int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : arr) {
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        System.out.println(map);
    }
    public static void main(String[] args) {
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
