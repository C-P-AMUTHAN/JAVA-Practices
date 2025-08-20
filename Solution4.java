// Missing in Array

class Solution4 {
    int missingNum(int arr[]) {
        long n = arr.length + 1;
        long sum = (long) ((n * (n + 1)) / 2);
        long arrSum = 0;
        for(long i : arr) {
            arrSum += i;
        }
        int result = (int)(sum - arrSum);
        return result;
    }
}
