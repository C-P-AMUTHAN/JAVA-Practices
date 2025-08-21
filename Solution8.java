// Find triplets with zero sum

class Solution8 {
    public boolean findTriplets(int[] arr) {
        if(arr.length < 3) {
            return false;
        }
        Arrays.sort(arr);
        for(int i=0; i<arr.length; i++) {
            int s = i+1, t = arr.length-1;
            while(s < t)  {
                int sum = arr[i] + arr[s] + arr[t];
                if(sum == 0) {
                    return true;
                }
                else if(sum < 0) {
                    s++;
                }
                else {
                    t--;
                }
            }
        }
        return false;
    }
}
