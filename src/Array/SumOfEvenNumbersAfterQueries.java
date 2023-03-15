package Array;
//https://leetcode.com/problems/sum-of-even-numbers-after-queries/

import java.util.Arrays;

public class SumOfEvenNumbersAfterQueries {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[][]queries = {{1,0},{-3,1},{-4,0},{2,3}};
        
//        System.out.println(Arrays.toString(sumEvenAfterQueries(nums,queries)));//TLE
        System.out.println(Arrays.toString(sumEvenAfterQueries2(nums,queries))); ///shi hai
    }
    public static int[] sumEvenAfterQueries2(int[] nums,int[][] queries){
        int[] ans = new int[nums.length];
        int sum = 0;
        for (int e: nums) {
            if(e % 2 == 0){
                sum += e;
            }
        }
        int index;
        for (int i = 0; i < queries.length; i++) {
            index = queries[i][1];

            if((nums[index] % 2) == 0){
                sum -= nums[index];
            }
            nums[index] += queries[i][0];
            if(nums[index]%2 == 0){
                sum += nums[index];
            }
            ans[i] = sum;
        }
        return ans;
    }

    public static int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int n = nums.length,m = queries.length,ind = 0;
        int[] ans = new int[n];

        for (int i = 0; i < m; i++) {
            int index = queries[i][1];
            nums[index] += queries[i][0];
            int sum = 0;
            for (int j = 0; j < n; j++) {
                if(nums[j]%2 == 0){
                    sum += nums[j];
                }
            }
            ans[ind++] = sum;
        }
        return ans;
        
    }
}
