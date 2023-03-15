package DynamicProgramming;

//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));

    }
    public static int maxProfit(int[] prices){
        return getProfit(prices,0,Integer.MAX_VALUE,0);
    }
    public static int getProfit(int[] prices,int ind,int mini,int maxPro){
        if(ind == prices.length){
            return maxPro;
        }
        mini = Math.min(mini,prices[ind]);
        int maxi = prices[ind]-mini;
        maxPro = Math.max(maxPro,maxi);

        return getProfit(prices,ind+1,mini,maxPro);

    }
}
