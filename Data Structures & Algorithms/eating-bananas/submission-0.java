class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = 0;
        // Find largest pile
        for (int pile : piles) {
            right = Math.max(right, pile);
        }
        while (left <= right) {
            int k = (left + right) / 2;
            int hours = 0;
            for (int pile : piles) {
                hours += (int) Math.ceil((double) pile / k);
            }
            if (hours > h) {
                left = k + 1;
            } else {
                right = k - 1;
            }
        }
        return left;
    }
}