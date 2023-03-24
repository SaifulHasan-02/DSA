package SlidingWindow;

import java.util.HashSet;
public class MaximumErasureValue {
    public static void main(String[] args) {
        int[] nums = {5,2,1,2,5,2,1,2,5};
        System.out.println(maxErasureValue(nums));
    }
    static int maxSum = 0;
    public static int maxErasureValue(int[] nums){
        int i =0;
        int j = 0;
        int sum = 0;
        HashSet<Integer> set = new HashSet<>();
        while(j<nums.length){
            if(!set.contains(nums[j])){
                set.add(nums[j]);
                sum= sum + nums[j];
                if(sum>maxSum){
                    maxSum = sum;
                }
                j++;
            }
            else{
                set.remove(nums[i]);
                sum = sum-nums[i];
                i++;

            }

        }
        return maxSum;
    }
}
