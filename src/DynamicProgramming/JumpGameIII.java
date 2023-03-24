package DynamicProgramming;

import java.util.Arrays;
public class JumpGameIII {
    public static void main(String[] args) {
        int[]arr = {3,0,2,1,2};
        int start = 2;
        System.out.println(canReach(arr,start));
    }
    public static boolean canReach(int[]arr, int start){
        int[]dp = new int[arr.length];
        Arrays.fill(dp, -1);
        return helper(arr, start, dp);
    }
    private static boolean helper(int[]arr, int ind, int[]dp){
        if(ind >= arr.length || ind < 0){
            return false;
        } else if (arr[ind] == 0){
            return true;
        }
        else if(dp[ind] != -1){
            return dp[ind] == 1 ? true : false;
        }

        boolean left = helper(arr, ind-arr[ind], dp);
        boolean right = helper(arr, ind+arr[ind], dp);
        dp[ind] = left || right ? 1 : 0;
        return dp[ind] == 1 ?true: false ;
    }
}
