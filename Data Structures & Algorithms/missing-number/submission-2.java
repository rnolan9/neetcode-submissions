class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        // This variable will hold our running XOR result. We start it at n to include every expected number.
        int missing = n;
        for(int i = 0; i < n; i++){
            //XOR in an expected number (i) and an actual array value (nums[i])
            missing = missing ^ i ^ nums[i];
        }
        return missing;
    }
}
