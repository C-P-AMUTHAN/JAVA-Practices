import java.util.*;
public class AutomorphicNumber
{
    public static boolean isAutomorphicNumber(int n) {
        int square = n * n;
        while(n != 0) {
            if((n%10) != (square%10)) 
                return false;
            n /= 10;
            square /= 10;
        }
        return true;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(isAutomorphicNumber(n));
        sc.close();
	}
}