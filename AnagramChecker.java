import java.util.*;
public class AnagramChecker {
    public static boolean isAnagram(String str1, String str2) {
        int[] alp = new int[26];
        for(char ch1 : str1.toCharArray()) {
            alp[ch1 - 97]++;
        }
        for(char ch2 : str2.toCharArray()) {
            alp[ch2 - 97]--;
        }
        for(char ch : str1.toCharArray()) {
            if(alp[ch - 97] != 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        if(str1.length() == str2.length() && isAnagram(str1, str2)) {
            System.out.println("Anagram");
        }
        else {
            System.out.println("Not anagram");
        }
        sc.close();
    }
}
