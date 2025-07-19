import java.util.*;
public class AbundantNumber
{
    public static boolean isHarshadNumber(int n) {
        int sum = ((n * (n+1)) / 2) - n;
        boolean result = sum > n ? true : false;
        return result;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(isHarshadNumber(n));
        sc.close();
	}
}
