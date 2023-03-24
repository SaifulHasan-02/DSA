package SlidingWindow;

import java.util.HashSet;

public class CountSubarraysWithFixedBounds {
    public static void main(String[] args) {
        int[] nums = {1,3,5,2,7,5};
        int minK = 1, maxK = 5;
        System.out.println(countSubarrays(nums, minK, maxK));
    }
    public static long countSubarrays(int[] nums, int minK, int maxK) {
        int i = 0, j = 0, n = nums.length;
        long count = 0;
        while (i <= j && j < n){
            boolean flagMin = false, flagMax = false;
            for (int k = i; k <= j; k++) {
                if(nums[k] == minK){
                    flagMin = true;
                }
                if(nums[k] == maxK){
                    flagMax = true;
                }
            }
            if(flagMin && flagMax){
                count++;
            }
            i++;
            j++;
        }
        return count;
    }
}
