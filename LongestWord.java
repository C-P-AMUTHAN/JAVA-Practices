import java.util.*;
public class LongestWord {
    public static void isLong(String str) {
        String[] array = str.trim().split("\\s+"); // spliting the words and storing in an array
        int index = 0;
        int len = 0;
        for(int i=0; i<array.length; i++) { // iterating the words in the array
            if(array[i].length() > len) { // comparing the length of the string with one another
                len = array[i].length(); // if length of the word is greater, store it for future check
                index = i; // storing the index of the longest word in the array
            }
        }
        System.out.println(array[index]); // using the index value we are getting the longest word
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        isLong(str);
        sc.close();
    }
}