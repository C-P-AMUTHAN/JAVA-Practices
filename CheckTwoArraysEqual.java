import java.util.*;
public class CheckTwoArraysEqual {
    public static boolean checkEquality(int s1, int s2, int[] arr1, int[] arr2) {
        if(s1 != s2) {
            return false;
        }

        HashMap<Integer, Integer> map1 = new HashMap<>();
        for(int num1 : arr1) {
            map1.put(num1, map1.getOrDefault(num1, 0)+1);
        }

        for(int num2 : arr2) {
            if(!map1.containsKey(num2)) {
                return false;
            }

            map1.put(num2, map1.get(num2) - 1);

            if(map1.get(num2) < 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s1 = sc.nextInt();
        int s2 = sc.nextInt();
        int[] arr1 = new int[s1];
        int[] arr2 = new int[s2];
        for(int i=0; i<s1; i++) {
            arr1[i] = sc.nextInt();
        }
        for(int j=0; j<s2; j++) {
            arr2[j] = sc.nextInt();
        }
        System.out.println(checkEquality(s1, s2, arr1, arr2));
        sc.close();
    }
}

// Checking whether two arrays are equal with respect to the elements and its frequency using HashMap