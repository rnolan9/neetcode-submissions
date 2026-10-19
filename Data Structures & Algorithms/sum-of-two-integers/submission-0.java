class Solution {
    public int getSum(int a, int b) {
        //We need a loop because a carry can create another carry.
        while(b != 0){
            //This calculates and saves the carry in two steps.
            int carry = (a & b) << 1;
            //This calculates the sum without carrying and stores it back in a.
            a = a ^ b;
            b = carry;
        }
        return a;
    }
}
