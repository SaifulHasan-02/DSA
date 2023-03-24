package DynamicProgrammingSeries;

import java.util.Arrays;

//https://leetcode.com/problems/fibonacci-number/
public class fibonacci {
    public static void main(String[] args) {
        int n = 6;
        System.out.println(fib(n));
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(fibDp(n,dp));
        System.out.println(fibTab(n));
    }
    public static int fib(int n){
        if(n == 0 || n == 1){
            return n;
        }
        return fib(n-1)+fib(n-2);
    }
    public static int fibDp(int n,int[] dp){
        if(n == 0 || n == 1)return n;

        if(dp[n] != -1)return dp[n];

        dp[n] = fibDp(n-1,dp) +fibDp(n-2,dp);
        return dp[n];
    }
    public static int fibTab(int n){
        if(n == 0)return 0;
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
}
