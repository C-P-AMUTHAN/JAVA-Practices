import java.io.*;
import java.util.*;

public class FurnishingCompany {
    public static int getCount(String str) {
        int count = 0;
        for(char ch : str.toCharArray()) {
            if(ch == 'a') {
                count++;
            }
        }
        return count;
    }
    public static void getMaxAqua(String str, int l) {
        int count = 0, i=0, n=l;
        while(i<str.length()) {
            String result = str.substring(i, n);
            int max = getCount(result);
            if(max > count) {
                count = max;
            }
            i=n;
            n += l;
            if(n >= str.length()) {
                n = str.length();
            }
        }
        if(count % 2 == 0) {
            System.out.printf("The Maximum number of a's is %02d...",count);
        }
        else {
            System.out.printf("The Maximum number of a's is %03d...",count);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int l = sc.nextInt();
        getMaxAqua(str, l);
    }
}
