class Solution {
    public int reverseBits(int n) {
        int result = 0;
        for(int i = 0; i < 32; i++){
            // It shifts the bits in result one position to the left, putting a 0 in the rightmost position.
            result = result << 1;
            // OR the rightmost bit
            result = result | (n & 1);
            // This updates n by shifting its bits one position to the right.
            n = n >>> 1;
        }
        return result;
    }
}
