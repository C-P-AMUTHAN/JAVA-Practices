class Solution6 {
    public List<Integer> frequencyCount(int[] arr) {
        int n = arr.length;
        ArrayList<Integer> result = new ArrayList<>();
        int[] hash = new int[n+1];
        for(int i : arr) {
            hash[i]++;
        }
        for(int i=1; i<hash.length; i++) {
            result.add(hash[i]);
        }
        return result;
    }
}
