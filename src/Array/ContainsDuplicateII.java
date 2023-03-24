package Array;

//https://leetcode.com/problems/contains-duplicate-ii/

import java.util.HashMap;

public class ContainsDuplicateII {
    public static void main(String[] args) {
        int[] nums = {1,0,1,1};
        int k = 1;
        System.out.println(containsNearbyDuplicate(nums,k));    //TLE
        System.out.println(containsNearbyDuplicate2(nums,k));

    }
    public static boolean containsNearbyDuplicate2(int[]nums,int k){
        HashMap<Integer,Integer>map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])){
                if(Math.abs(map.get(nums[i])-i) <= k){
                    return true;
                }
                else{
                    map.remove(nums[i]);
                    map.put(nums[i],i);
                }
            }
            else{
                map.put(nums[i],i);
            }
        }
        return false;
    }
    public static boolean containsNearbyDuplicate(int[] nums, int k) {  //TLE
        int n = nums.length;

        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                if(nums[i] == nums[j] && Math.abs(i-j) <= k){
                    return true;
                }
            }
        }
        return false;
    }
}
