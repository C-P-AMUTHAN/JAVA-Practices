import java.util.*;
public class LeapYear {
    public static void isLeapYear(int year) {
        String result = (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) ? "Leap year" : "Not leap year";
        System.out.println(result);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        isLeapYear(year);
        sc.close();
    }
}
