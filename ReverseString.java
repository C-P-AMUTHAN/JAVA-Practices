import java.util.*;
public class ReverseString {
    public static void reverse(String str) {
        StringBuilder string = new StringBuilder(str);
        String reversed = string.reverse().toString();
        System.out.println(reversed);
    }
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        reverse(str); 
        sc.close();  
    }
}