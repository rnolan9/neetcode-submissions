class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        //buying
        int left = 0;
        // selling
        int right = 1;
        while(right < prices.length){
            // is it profit
            if(prices[left] < prices[right]){
                int profit = prices[right] - prices[left];
                maxProfit = Math.max(maxProfit, profit);
            } else {
                left = right;
            }
            right++;
        }
        return maxProfit;
    }
}
