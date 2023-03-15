package SubSetProblem;

import java.util.Arrays;

//https://leetcode.com/problems/unique-paths/
public class MazeProblem {
    public static void main(String[] args) {
        int m = 3;
        int n = 7;
        System.out.println(uniquePaths(m-1,n-1));
        System.out.println(uniquePathsMemo(m-1,n-1));
        System.out.println(uniquePathsTabular(m-1,n-1));
        System.out.println(fibo(5));
    }
    public static int uniquePaths(int m, int n) {
        if(m == 0 || n == 0){
            return 1;
        }
        int down = uniquePaths(m-1,n);
        int right = uniquePaths(m,n-1);
        return down+right;
    }
    public static int uniquePathsMemo(int m, int n) {
        int[][]dp = new int[m+1][n+1];
        for (int[] arr:dp) {
            Arrays.fill(arr,-1);
        }
        return uniquePathsMemoAns(m,n,dp);
    }
    public static int uniquePathsMemoAns(int m,int n,int[][]dp){
        if(m == 0 || n == 0){
            return 1;
        }
        else if(dp[m][n] != -1)return dp[m][n];
        int down = uniquePathsMemo(m-1,n);
        int right = uniquePathsMemo(m,n-1);
        dp[m][n] =  down+right;
        return dp[m][n];
    }
    //Glt hai
    public static int uniquePathsTabular(int m,int n){
        int[][]dp = new int[m+1][n+1];

        dp[0][0] = 1;
        dp[1][0] = 1;
        dp[0][1] = 1;
        for (int i = 1; i <= m ; i++) {
            for (int j = 1; j <= n ; j++) {
                 dp[i][j] = dp[i-1][j]+dp[i][j-1];
            }
        }
        for (int[] arr:dp) {
            System.out.println(Arrays.toString(arr));
        }
        return dp[m][n];

    }
    public static int fibo(int n){
        int[]dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n ; i++) {
            dp[i] = dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
}
