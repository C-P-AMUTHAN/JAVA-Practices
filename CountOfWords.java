import java.util.*;
public class CountOfWords {
    public static void countWords(String str) {
        String[] result = str.trim().split("\\s+");
        // trim() reduces leading spaces
        // \\s+ handles multiple spaces correctly
        int count = result.length;
        System.out.println(count);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        countWords(str);
        sc.close();
    }
}