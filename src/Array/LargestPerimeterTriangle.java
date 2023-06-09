package Array;

//https://leetcode.com/problems/largest-perimeter-triangle/

import java.util.Arrays;


public class LargestPerimeterTriangle {
    public static void main(String[] args) {
        int[] nums = {2,1,2};
        System.out.println(largestPerimeter(nums));

    }
    public static int largestPerimeter(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);

        for (int i = n-3; i >= 0 ; i--) {
            if(nums[i] + nums[i+1] > nums[i+2]){
                return nums[i] + nums[i+1] + nums[i+2];
            }
        }
        return 0;

    }
}
