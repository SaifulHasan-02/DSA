package LeetCode;
//https://leetcode.com/problems/squares-of-a-sorted-array/submissions/
import java.util.Arrays;

public class SquaresOfASortedArray {
    public static void main(String[] args) {
        int[] arr = {-4,-1,0,3,10};
        System.out.println(Arrays.toString(sortedSquares(arr)));
    }
    public static int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int start  = 0;
        int end = n-1;
        for (int i = end; i >=0 ; i--) {
            if(Math.abs(nums[end])>Math.abs(nums[start])){
                ans[i] = nums[end]*nums[end];
                end--;
            }else{
                ans[i] = nums[start]*nums[start];
                start++;
            }
        }
        return ans;

    }
}
