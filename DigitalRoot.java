import java.util.Scanner;

public class DigitalRoot {
    // Function to find digital root
    public static int digitalRoot(int num) {
        while (num >= 10) {
            int sum = 0;
            while (num > 0) {
                sum += num % 10;  // Get last digit and add to sum
                num /= 10;        // Remove last digit
            }
            num = sum;  // Update num with the sum of digits
        }
        return num;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();
        System.out.println("Single-digit sum (Digital Root): " + digitalRoot(num));
    }
}