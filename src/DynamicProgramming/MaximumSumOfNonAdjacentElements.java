package DynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;

//https://www.codingninjas.com/codestudio/problems/maximum-sum-of-non-adjacent-elements_843261?source=youtube&campaign=striver_dp_videos&utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_dp_videos
public class MaximumSumOfNonAdjacentElements {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(5);
        list.add(10);
        list.add(100);
        list.add(10);
        list.add(5);
        int n = list.size();
        int[] arr = new int[n];
        int i = 0;
        for (Integer e : list){
            arr[i] = (int)e;
            i++;
        }
        int[] dp = new int[n];
        Arrays.fill(dp,-1);

        System.out.println(maxSum(arr,arr.length-1,dp));

    }
    public static int maxSum(int[] arr,int ind,int[]dp){
        if(ind == 0) return arr[ind];
        if(ind<0) return 0;
        if(dp[ind] != -1) return dp[ind];
        int pick = arr[ind]+maxSum(arr,ind-2,dp);
        int notPick = maxSum(arr,ind-1,dp);
        dp[ind] = Math.max(pick,notPick);
        return dp[ind];
    }
}
