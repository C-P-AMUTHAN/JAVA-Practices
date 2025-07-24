import java.util.*;
public class MajorityElement {public static void getMajority(int n, int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : arr) {
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        int maj = arr.length / 2;
        for(Map.Entry<Integer, Integer> entry :map.entrySet()) {
            if(entry.getValue() > maj) {
                System.out.println(entry.getKey());
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
        getMajority(n, arr);
        sc.close();
    }
}

// Getting the majority frequency elements present in the array using HashMap