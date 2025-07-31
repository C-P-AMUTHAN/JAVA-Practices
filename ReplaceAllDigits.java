import java.io.*;
import java.util.*;

public class ReplaceAllDigits {
    public static void replaceDigit(String str) {
        String result = "";
        for(int i=0, j=1; i<str.length() && j<str.length(); i+=2,j+=2) {
            result += str.charAt(i);
            result += (char)(str.charAt(i) + (str.charAt(j)-48));
        }
        if(str.length() % 2 !=0) {
            result += str.charAt(str.length()-1);
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        replaceDigit(str);
    }
}
