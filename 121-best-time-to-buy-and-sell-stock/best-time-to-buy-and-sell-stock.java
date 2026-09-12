class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int minPrice = Integer.MAX_VALUE;
        int profit = 0;
        for(int i=0; i<n; i++){
            if(prices[i]<minPrice){
                minPrice = prices[i];
            }
            profit = Math.max(profit , prices[i] - minPrice);
        }
        

       return profit;
    }
}