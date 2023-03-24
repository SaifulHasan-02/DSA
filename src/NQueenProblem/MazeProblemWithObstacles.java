package NQueenProblem;

import java.util.Arrays;

public class MazeProblemWithObstacles {
    public static void main(String[] args) {
        int[][] grid = {{0,0,0},{0,1,0},{0,0,0}};
//            int[][] grid = {{0,1},{0,0}};
        int[][] dp = new int[3][3];
        for(int[]arr:dp){
            Arrays.fill(arr,-1);
        }
//        for(int[]arr:dp){
//            System.out.println(Arrays.toString(arr));
//        }
        System.out.println(countPath(grid,0,0,dp,3,3));
    }
    public static int countPath(int[][] grid,int row,int col,int[][]dp,int n,int m){
        if(row == n || col == m || grid[row][col] == 1) return 0;

        if(row == n-1 && col == m-1)return 1;

        if(dp[row][col] != -1) return dp[row][col];

        int left = countPath(grid,row+1,col,dp,n,m);
        int right = countPath(grid,row,col+1,dp,n,m);
        dp[row][col] = left+right;
        return dp[row][col];
    }
}
