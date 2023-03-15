package Array;

//https://leetcode.com/problems/reverse-pairs/

public class ReversePairs {
    public static void main(String[] args) {
        int[] nums = {2147483647,2147483647,2147483647,2147483647,2147483647,2147483647};
        System.out.println(reversePairs(nums));
    }
    public static int reversePairs(int[] nums) {
        int c = 0;
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i] == nums[i+1])
                c++;
        }
        System.out.println(c);

        int count = 0;
        int n = nums.length;
        for(int i =0;i<n-1;i++){
            for(int j = i+1;j<n;j++){
                if(nums[i] > 2*nums[j]){
                    count++;
                }
            }
        }
        return count;
    }
}
