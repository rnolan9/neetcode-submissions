class Solution {
    public int hammingWeight(int n) {
        int count = 0;
        // check all 32 bit positions.
        for(int i = 0; i < 32; i++){
            // & means bitwise AND.
            count = count + (n & 1);
            //This shifts n’s bits one position to the right. EX 11011 goes to 01101
            n = n >>> 1;
        }
        return count;
    }
}
