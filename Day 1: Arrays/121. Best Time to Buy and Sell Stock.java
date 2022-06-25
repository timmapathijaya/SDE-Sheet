class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0 , buy = prices[0];
        for(int i = 1 ; i < prices.length ; i++)
        {
            // consider every ith day as a valid selling day & calculate the profit earned
            profit = Math.max(profit , prices[i] - buy);
            buy = Math.min(buy , prices[i]);
        }
        return profit;
    }
}
// TC : O(N)
// SC : O(1)
