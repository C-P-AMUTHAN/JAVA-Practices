import java.util.*;
public class DecimalToHexaDecimal {
    public static void getHexadecimal(int n) {
        String hex = "";
        while(n != 0) {
            int rem = n % 16;
            if(rem > 9) {
                hex += (char)(rem + 55);
            } else {
                hex += rem;
            }
            n = n/16;
        }
        for(int i=hex.length()-1; i>=0; i--) {
            System.out.print(hex.charAt(i));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        getHexadecimal(n);
        sc.close();
    }
}
