//  Rotate array by K
import java.util.ArrayList;

public class Solution7 {
	public static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int k) {
        reverse(arr, 0, k-1);
        reverse(arr, k, arr.size()-1);
        reverse(arr, 0, arr.size()-1);
        return arr;
    }
    public static void reverse(ArrayList<Integer> arr, int start, int end) {
        while(start < end) {
            int temp = arr.get(start);
            arr.set(start, arr.get(end));
            arr.set(end, temp); 
            start++;
            end--;
        }
    }
}
