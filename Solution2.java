// User function Template for Java
// Count Digits

class Solution2 {
    static int evenlyDivides(int n) {
        int copy = n;
        int count = 0;
        while(copy != 0) {
            int rem = copy % 10;
            if(rem != 0 && n % rem == 0) {
                count++;
            }
            copy /= 10;
        }
        return count;
    }
}
