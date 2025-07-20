import java.util.*;
public class HexaDecimalToDecimal {
    public static int getPower(int n, int p) {
        int result = 1;
        for(int i=0; i<p; i++) {
            result *= n;
        }
        return result;
    }
    public static void toDecimal(String hex) {
        int dec = 0;
        int pow = 0;
        for(int i=hex.length()-1; i>=0; i--) {
            if(hex.charAt(i) >= 65 && hex.charAt(i) <= 70) {
                dec += ((int)hex.charAt(i) - 65 + 10) * getPower(16, pow);
            }
            else {
                dec += ((int)hex.charAt(i) - 48) * getPower(16, pow);
            }
            pow++;
        }
        System.out.println(dec);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String hex = sc.next();
        toDecimal(hex);
        sc.close();
    }
}
