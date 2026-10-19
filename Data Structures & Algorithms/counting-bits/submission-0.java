class Solution {
    public int[] countBits(int n) {
        // 1 box for 0 + n other boxes
        int[] result = new int[n + 1];
        // we loop through the numbers whose answers we need to calculate:
        for(int i = 1; i <= n; i++){
            // Take the count for the number with its last bit removed, then add that last bit.
            result[i] = result[i >>> 1] + (i & 1);
        }
        return result;
    }
}
