class Solution {
    public int hammingWeight(int n) {
        int count = 0;
        // check all 32 bit positions.
        for(int i = 0; i < 32; i++){
            // & means bitwise AND.
            count = count + (n & 1);
            //This shifts n’s bits one position to the right
            n >>>=1;
        }
        return count;
    }
}
