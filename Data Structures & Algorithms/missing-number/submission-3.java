class Solution {
    public int missingNumber(int[] nums) {
        int[] count = new int[nums.length + 1];
        // go through the num array and count numbers
        for(int num : nums){
            count[num]++;
        }
        // go through count array and see which one is missing
        for(int i = 0; i < count.length; i++){
            if(count[i] == 0){
                return i;
            }
        } 
        return -1;
    }
}