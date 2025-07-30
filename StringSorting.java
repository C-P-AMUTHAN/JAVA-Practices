import java.io.*;
import java.util.*;

public class StringSorting {
    public static void getSort(String str) {
        int[] arr = new int[26];
        for(char ch : str.toCharArray()) {
            arr[ch-'a']++;
        }
        String result = "";
        for(int i=0; i<26; i++) {
            if(arr[i] > 0) {
                for(int k=0; k<arr[i]; k++) {
                    result += (char)(i+97);
                }
            }
        }
        System.out.println("The sorted string is "+result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        getSort(str);
    }
}
