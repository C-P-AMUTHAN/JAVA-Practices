import java.util.*;
public class SymbolReplace {
    public static void replaceChar(String str) {
        String result = str.replace(' ', '_');
        System.out.println(result);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        replaceChar(str);
        sc.close();
    }
}