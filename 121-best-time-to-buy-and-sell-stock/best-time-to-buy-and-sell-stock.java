class Solution {
    public int maxProfit(int[] prices) {
        int max_profit =0;
        //int profit = 0;
        int suffix = Integer.MIN_VALUE;
        for(int i = prices.length-1;i>=0;i--){
            suffix = Math.max(suffix,prices[i]);
            if(suffix > prices[i]){
                max_profit = Math.max(max_profit,(suffix-prices[i]));
            }

        }
        return max_profit;
        
        
    }
}