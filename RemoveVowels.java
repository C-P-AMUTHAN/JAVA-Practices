import java.util.*;
public class RemoveVowels {
    public static void remVowels(String str) {
        String result = str.replaceAll("[aeiouAEIOU]", "");
        System.out.println(result);
    }
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        remVowels(str);
        sc.close();
    }
}