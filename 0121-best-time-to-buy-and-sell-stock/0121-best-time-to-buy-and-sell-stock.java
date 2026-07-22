class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int buy = prices[0];

        for(int i = 1; i < prices.length; i++){
            buy = Math.min(buy, prices[i]);  // best buying price so far
            int profit = prices[i] - buy;   // sell today
            max = Math.max(max, profit);
        }
        return max;
    }
}