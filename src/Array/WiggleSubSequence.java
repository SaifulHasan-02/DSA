package Array;
//https://leetcode.com/problems/wiggle-subsequence/

public class WiggleSubSequence {
    public static void main(String[] args) {
        int[] nums = {1,17,5,10,13,15,10,5,16,8};
        System.out.println(wiggleMaxLength(nums));
    }
    public static int wiggleMaxLength(int[] nums){
        int n = nums.length;
        if(n <= 1) return 1;

        int incr = 1,decr =1;
        for (int i = 1; i < n; i++) {

            if(nums[i] >nums[i-1]) incr = decr+1;

            else if(nums[i] < nums[i-1]) decr = incr+1;

        }
        return (int)Math.max(incr,decr);
    }
}
