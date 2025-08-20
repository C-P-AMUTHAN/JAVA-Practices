// User function Template for Java
// Find Last Digit Of a^b for Large Numbers

class Solution1 {
    static int getLastDigit(String a, String b) {
        if(b.equals("0")) {
            return 1;
        }
        int base = a.charAt(a.length() - 1) - '0';
        int effExp = 0;
        if(b.length() > 1) {
            String last = b.substring(b.length() - 2);
            int lastTwoDigit = Integer.parseInt(last);
            effExp = lastTwoDigit % 4;
        }
        else {
            effExp = Integer.parseInt(b) % 4;
        }
        if(effExp == 0) {
            effExp = 4;
        }
        int result = 1;
        for(int i=0; i<effExp; i++) {
            result *= base;
        }
        return result % 10;
    }
};
