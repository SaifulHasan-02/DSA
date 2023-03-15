package DynamicProgramming;
//https://leetcode.com/problems/jump-game-ii/
import java.util.Arrays;

public class JumpGame2 {
    public static void main(String[] args) {
        int[] nums = {2,3,0,1,4};
        System.out.println(jump(nums));
    }
    public static int jump(int[]nums){
        int n = nums.length;
        int[]dp = new int[n];
        Arrays.fill(dp, -1);
        return helper(nums,0,nums.length-1,dp);
    }
    private static int helper(int[]nums, int ind, int len,int[]dp){
        if(ind == len){
             return 0;
        }
        else if(dp[ind] != -1){
            return dp[ind];
        }

        int minJump = Integer.MAX_VALUE-1;
        for(int i = 1; i + ind<= len && i <= nums[ind]; i++){
            minJump = Math.min(minJump, 1 + helper(nums, ind+i, len, dp));
        }
        dp[ind] = minJump;
        return dp[ind];
    }
}
