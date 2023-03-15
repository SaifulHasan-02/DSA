package Array;

//https://leetcode.com/problems/increasing-triplet-subsequence/

public class IncreasingTripletSubsequence {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        System.out.println(increasingTriplet(nums));

    }
    public static boolean increasingTriplet(int[] nums) {
        int n = nums.length;
        if(n < 3)return false;

        int minI = Integer.MAX_VALUE;
        int minJ = Integer.MAX_VALUE;

        for (int e:nums) {
            if(e <= minI){
                minI = e;
            }
            else if(e <= minJ){
                minJ = e;
            }
            else
                return true;
        }
        return false;

    }
}
