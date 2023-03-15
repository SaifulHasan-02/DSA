package Array;

//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        System.out.println(maxProfit(arr)); // TLE
        System.out.println(maxProfit2(arr));

    }
    public static int maxProfit2(int[] arr){
        return 0;
    }
    public static int maxProfit(int[] arr){
        int n = arr.length;
        int profit = 0;
        for (int i = 0; i < n-1 ; i++) {
            for (int j = i+1; j < n; j++) {
                if(arr[i]<arr[j]){
                    profit = Math.max(arr[j]-arr[i],profit);
                }
            }
        }

        return profit;
    }
}
