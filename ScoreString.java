import java.io.*;
import java.util.*;

public class ScoreString {
    public static void getSum(String s) {
        int sum  = 0;
        for(int i=0; i<s.length()-1; i++) {
            sum += Math.abs(s.charAt(i) - s.charAt(i+1));
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        getSum(s);
    }
}
