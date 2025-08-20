// Array Subset

class Solution5 {
    public boolean isSubset(int a[], int b[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : a) {
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        for(int j : b) {
            int currentKey = map.getOrDefault(j, 0);
            if(currentKey == 0) {
                return false;
            }
            else {
                currentKey--;
            }
            map.put(j, currentKey);
        }
        return true;
    }
}
