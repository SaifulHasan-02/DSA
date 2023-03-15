package Array;

import java.util.Arrays;

//https://leetcode.com/problems/sort-colors/

public class SortColors {
    public static void main(String[] args) {
        int[]nums = {2,0,2,1,1,0};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void sortColors(int[] nums) {
        int countZero = 0,countOne = 0,countTwo = 0;

        for (int num : nums) {
            if (num == 0) {
                countZero++;
            } else if (num == 1) {
                countOne++;
            } else {
                countTwo++;
            }
        }

        int ind = 0;
        while (countZero>0){
            nums[ind++] = 0;
            countZero--;
        }
        while (countOne>0){
            nums[ind++] = 1;
            countOne--;
        }
        while (countTwo>0){
            nums[ind++] = 2;
            countTwo--;
        }
    }
}
