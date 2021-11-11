class Solution {
    public int maxProfit(int[] prices) {
        int buy1 = -prices[0];
        int buy2 = -prices[0];
    
        int profit = 0;
        int total_profit = 0 ;
    
        for(int price : prices) {
            buy1=Math.max(buy1,-price);
            profit = Math.max(profit ,  price + buy1);
        
            buy2=Math.max(buy2,profit-price);
            total_profit=Math.max(total_profit,price+buy2);
        }
        
        return total_profit;
    }
}