import java.util.*;
public class CharactersFrequency {
    public static void calcFrequency(String str) {
        int[] characters = new int[26];
        for(char ch : str.toCharArray()) {
            ch = Character.toLowerCase(ch);
            characters[ch - 97]++;
        }
        for(int i=0; i<26; i++) {
            if(characters[i]!=0) {
                System.out.println((char)(i+97)+" = "+characters[i]);
            }
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        calcFrequency(str);
        sc.close();
    }
}