package Array;

import java.util.Arrays;

public class MovesZero {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        movesZero(nums);
        System.out.println(Arrays.toString(nums));

    }
    public static void movesZero(int[] nums){
       int ind = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != 0){
                nums[ind++] = nums[i];
            }
        }
       while (ind< nums.length){
           nums[ind++] = 0;
       }
    }


}
