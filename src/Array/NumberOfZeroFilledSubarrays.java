package Array;
//https://leetcode.com/problems/number-of-zero-filled-subarrays/description/
public class NumberOfZeroFilledSubarrays {
    public static void main(String[] args) {
        int[]nums = {1,3,0,0,2,0,0,4};
        System.out.println(zeroFilledSubarray(nums));
    }
    public static long zeroFilledSubarray(int[] nums){
        int zero = 0;
        long ans = 0;
        for(int num : nums){
            if(num == 0){
                zero++;
                ans += zero;
            }else{
                zero = 0;
            }
        }
        return ans;
    }
}
