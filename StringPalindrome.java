import java.util.*;
public class StringPalindrome {
    public static void isPalindrome(String str) {
        String copy = str;
        StringBuilder string = new StringBuilder(str);
        String reversed = string.reverse().toString();
        if(copy.equals(reversed)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        isPalindrome(str);
        sc.close();
    }
}