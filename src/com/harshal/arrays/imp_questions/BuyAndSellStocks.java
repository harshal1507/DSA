package com.harshal.arrays.imp_questions;

public class BuyAndSellStocks {
    public static void main(String[] args) {

        int[] prices = {7,1,5,3,6,4};
        System.out.println(calculateMaximumProfit(prices));
    }

    private static int calculateMaximumProfit(int[] prices){
        int maximumProfit = 0;
        int buyingPrice = Integer.MAX_VALUE;

        for (int i = 0; i < prices.length; i++) {
            if(buyingPrice<prices[i]){
                int profit = prices[i]-buyingPrice;
                maximumProfit = Math.max(profit, maximumProfit);
            }else{
                buyingPrice = prices[i];
            }
        }

        return maximumProfit;
    }
}
