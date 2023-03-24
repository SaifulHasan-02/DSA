package Array;

import java.util.Arrays;

public class FibonacciNumber {
    public static void main(String[] args) {
        int n = 10;
        fibSeries(n);
    }

    private static int getFib(int n) {

        return (int)Math.pow((Math.sqrt(5)+1)/2,n);
    }
    public static int fib(int n){
        if(n == 0 || n == 1){
            return n;
        }
        return fib(n-1)+fib(n-2);
    }
    public static void fibSeries(int n){

        for (int i = 0; i <= n ; i++) {
            System.out.print(fibDp(i)+" ");
        }
    }
    private static int fibDp(int n){
        if(n == 0 || n == 1)
            return n;

        int[]dp = new int[n+1];

        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i <= n ; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }

        return dp[n];
    }
}
