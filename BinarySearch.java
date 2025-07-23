import java.util.*;
public class BinarySearch {
    public static void binSearch(int n, int[] arr, int key) {
        int low = 0, high = n-1;
        while(low <= high) {
            int mid = (low + high) / 2;
            if(arr[mid] == key) {
                System.out.println("Element found in "+mid);
                return;
            }else if(arr[mid] > key) {
                high = mid - 1;
            }else {
                low = mid + 1;
            }
        }
        System.out.println("Element not found");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        int key = sc.nextInt();
        binSearch(n, arr, key);
        sc.close();
    }
}
