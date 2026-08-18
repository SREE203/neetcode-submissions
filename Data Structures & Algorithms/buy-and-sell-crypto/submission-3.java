class Solution {
    public int maxProfit(int[] prices) {
        int max = -101;
        int least_price = prices[0];
        for (int p : prices){
            least_price = Math.min(p, least_price);
            int curr_profit = p - least_price;
            max = Math.max(max, curr_profit);
        }
        max = max < 0 ? 0 : max;
        return max;
    }
}
