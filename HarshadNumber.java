import java.util.*;
public class HarshadNumber
{
    public static void isHarshadNumber(int n) {
        int sum = 0;
        int temp = n;
        while(temp != 0) {
            sum += temp % 10;
            temp /= 10;
        }
        if(n % sum == 0) {
            System.out.println(n+" is harshad number");
        }else {
            System.out.println(n+" is not harshad number");
        }
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		isHarshadNumber(n);
        sc.close();
	}
}
