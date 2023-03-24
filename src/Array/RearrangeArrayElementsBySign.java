package Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RearrangeArrayElementsBySign {
    public static void main(String[] args) {
        int[]nums = {3,1,-2,-5,2,-4};
        System.out.println(Arrays.toString(rearrangeArray(nums)));
    }
    public static int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[]pos = new int[n/2];
        int[]neg = new int[n/2];
        int ind = 0, k = 0;
        for(int num : nums){
            if(num < 0){
                neg[ind++] = num;
            }else{
                pos[k++] = num;
            }
        }
        int i = 0, j = 0, z = 0;
        

        System.out.println(Arrays.toString(nums));

        return nums;
    }
}
