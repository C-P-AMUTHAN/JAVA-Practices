import java.util.*;
public class FirstNonRepeatingCharacter {
    public static void printNonRepeating(String str) {
        int[] arr = new int[26];
        for(char ch : str.toCharArray()) {
            arr[ch - 97]++;
        }
        for(char ch : str.toCharArray()) {
            if(arr[ch - 97] == 1) {
                System.out.println(ch);
                return;
            }
        }
        System.out.println("none");
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        printNonRepeating(str);
        sc.close();
    }
}
