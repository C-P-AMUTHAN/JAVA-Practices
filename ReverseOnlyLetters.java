import java.util.*;
public class ReverseOnlyLetters {
    public static void getReverse(String str) {
        int start = 0, end = str.length()-1;
        String front = "", back = "";
        while(start < end) {
            if((str.charAt(start) >= 97 && str.charAt(start) <= 122) || (str.charAt(start) >= 65 && str.charAt(start) <= 90)) {
                if((str.charAt(end) >= 97 && str.charAt(end) <= 122) || (str.charAt(end) >= 65 && str.charAt(end) <= 90)) {
                    front += str.charAt(end);
                    back += str.charAt(start);
                    start++;
                }
                else {
                    back += str.charAt(end);
                }
                end--;
            }
            else {
                front += str.charAt(start);
                start++;
            }
        }
        if(start == end) {
            front += str.charAt(start);
        }
        for(int i=back.length()-1; i>=0; i--) {
            front += back.charAt(i);
        }
        System.out.println(front);
    }
    public static void main(String CAMP[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        getReverse(str);
        sc.close();
    }
}
