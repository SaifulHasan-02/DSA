package SlidingWindow;

import java.util.Arrays;
//https://leetcode.com/problems/maximum-subarray/description/
public class MaximumSubArraySum {
    public static void main(String[] args) {
        int[] nums = {5,4,-1,7,8};
//        System.out.println(maxSumBrute(nums));
        System.out.println(maxSum(nums));
        System.out.println(Arrays.toString(maxSumArray(nums)));
    }

    private static int[] maxSumArray(int [] nums){
        int maxSum = Integer.MIN_VALUE, currSum = 0;
        int start = 0, end = -1;
        for (int i = 0; i < nums.length; i++) {
            currSum += nums[i];
            if(maxSum < currSum){
                maxSum = currSum;
                end = i;
            }
            if(currSum < 0){
                currSum = 0;
                start = i+1;
            }
        }
        int [] ans = new int[end-start+1];
        int ind = 0;
        for (int i = start; i <= end ; i++) {
            ans[ind++] = nums[i];
        }
        return ans;
    }
    private static int maxSumBrute(int[]nums){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                max = Math.max(max, sum);
            }
        }
        return max;
    }
    private static int maxSum(int[]nums){
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            max = Math.max(max, sum);
            if(sum < 0) sum = 0;
        }
        return max;
    }
}
