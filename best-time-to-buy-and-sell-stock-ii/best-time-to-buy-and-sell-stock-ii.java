class Solution {
    public int maxProfit(int[] prices) {
        int result =0;
        int buy = prices[0];
        for(int i=1; i<prices.length; i++) {
            if(buy> prices[i]) buy = prices[i];
            else {
                int sum = prices[i] - buy;
                result+= sum;
                buy = prices[i];
            }
        }
        return result;
    }
}