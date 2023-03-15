package DynamicProgramming;

import java.util.Arrays;

public class JumpGame {
    public static void main(String[] args) {
        int[]nums = {2,3,1,1,4};
        System.out.println(canJump(nums));
    }
    public static boolean canJump(int[]nums){
        int n = nums.length;
        int[]dp = new int[n];
        Arrays.fill(dp, -1);
        return helper(nums,0,nums.length-1,dp);
    }
    private static boolean helper(int[]nums, int ind, int len,int[]dp){
        if(ind == len){
            dp[ind] = 1;
            return true;
        }
        else if(nums[ind] == 0){
            dp[ind] = 0;
            return false;
        }
        else if(dp[ind] != -1){
            return dp[ind] == 1;
        }
        boolean res = false;
        for(int i = 1; i <= nums[ind]; i++){
            res = helper(nums, ind+i, len, dp);
            if(res){
                dp[ind] = 1;
                return true;
            }
        }
        return false;
    }
}
