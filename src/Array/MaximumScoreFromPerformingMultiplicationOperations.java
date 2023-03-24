package Array;
//https://leetcode.com/problems/maximum-score-from-performing-multiplication-operations/

import java.util.Arrays;

public class MaximumScoreFromPerformingMultiplicationOperations {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int[] multipliers = {3, 2, 1};
        System.out.println(maximumScore(nums, multipliers));
    }

    public static int maximumScore(int[] nums, int[] multipliers) {
        int n = nums.length,m = multipliers.length,curr = 0,start = 0;
        int[][]dp = new int[m][m];

        //ye use kr rhe hai to TLE  de rha hai
//        for (int[] arr:dp) {
//            Arrays.fill(arr,-1);
//        }

        return maxScore(nums,multipliers,m,curr,start,n-1,dp);
    }
    public static int maxScore(int[]nums,int[] multipliers,int m,int curr,int start,int end,int[][]dp){
        if(curr == m){
            return 0;
        }
//        if(dp[start][curr] != -1)return dp[start][curr];
        if(dp[start][curr] != 0)return dp[start][curr];
        int left = maxScore(nums,multipliers,m,curr+1,start+1,end,dp)+multipliers[curr]*nums[start];

        int right = maxScore(nums,multipliers,m,curr+1,start,end-1,dp)+multipliers[curr]*nums[end];
        dp[start][curr] = Math.max(left,right);
        return dp[start][curr];
    }
}
