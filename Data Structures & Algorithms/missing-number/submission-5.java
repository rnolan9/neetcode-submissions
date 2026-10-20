class Solution {
    public int missingNumber(int[] nums) {
        int result = 0;
        // XOR every expected number: 0 through n
        for (int expected = 0; expected <= nums.length; expected++) {
            result ^= expected;
        }
        // XOR every number acctully present
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }
}