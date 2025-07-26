import java.util.*;
public class StringAnagramChecker {
    public static boolean checkAnagram(String str1, String str2) {
        // if two strings length is different, then it is not anagram.
        if(str1.length() != str2.length()) {
            return false;
        }

        int[] count = new int[26]; // initializing an array of integers with size 26.
        str1 = str1.toLowerCase(); // converting all uppercase letters to lowercase.
        str2 = str2.toLowerCase(); // converting all uppercase letters to lowercase.

        for(char ch : str1.toCharArray()) { 
            count[ch - 97]++;
        }
        for(char ch : str2.toCharArray()) {
            count[ch - 97]--;
        }

        // checking all elements are zero or not.
        for(int i=0; i<26; i++) {
            if(count[i] != 0) {
                return false;
            }
        }
        return true;
    }
    // main method
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine(); // getting first string.
        String str2 = sc.nextLine(); // getting second string.
        //checking by true or false by passing in a method.
        if(checkAnagram(str1, str2)) { 
            System.out.println("The given strings are anagram");
        } else {
            System.out.println("The given strings are not anagram");
        }
        sc.close();
    }
}

// anagram (same letters arranged in different combination to get two different words) example:
// 1) listen - silent.
// 2) triangle - integral.

// hello - world (not anagram).

// ASCII value - (a-z) (97 - 123) for example: to get a = 97-97 = 0, b = 98-97 = 1(array index).

// (a-z) - a b c d e f g h i j k l m n o p q r s t u v w x y z
// array - 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 

// after 1 string passing in for loop (listen) - incrementing the character value alone by 1.
// (a-z) - a b c d e f g h i j k l m n o p q r s t u v w x y z
// array - 0 0 0 0 1 0 0 0 1 0 0 1 0 1 0 0 0 0 1 0 0 0 0 0 0 0 

// after 2 string passing in for loop (listen) - decrementing the character value alone by 1.
// (a-z) - a b c d e f g h i j k l m n o p q r s t u v w x y z
// array - 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 

// atlast if all elements of array are zero, both strings are anagram, else not anagram.