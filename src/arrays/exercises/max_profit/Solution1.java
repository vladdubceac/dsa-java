package arrays.exercises.max_profit;

public class Solution1 {
//    You are given an array prices where prices[i] is the price of a given stock on the ith day. You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock. Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
//    Example:
//        Input: prices = [7, 1, 5, 3, 6, 4]
//        Output: 5
//    Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
    public static int maxProfit(int[] prices) {
        // TODO
        int maxProfit = prices[1]-prices[0];
        int bestPrice = prices[0];
        for(int i = 1;i<prices.length;i++){
            if(prices[i]<bestPrice){
                bestPrice = prices[i];
            }
            if(prices[i]-bestPrice > maxProfit){
                maxProfit=prices[i]-bestPrice;
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = new int[]{7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices));
    }
}
