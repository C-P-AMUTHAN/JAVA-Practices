import java.util.*;
public class RemoveDuplicateCharacters {
    public static void removeDuplicate(String str) {
        boolean[] seen = new boolean[256]; // Supports all ASCII characters
        StringBuilder result = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (!seen[ch]) { // Check if character is seen before
                seen[ch] = true;
                result.append(ch);
            }
        }
        System.out.println(result.toString());
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        removeDuplicate(str);
        sc.close();
    }
}