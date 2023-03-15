package HashMapDemo;


//https://leetcode.com/problems/contains-duplicate-ii/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class ContainsDuplicateII {
    public static void main(String[] args) {
        int[] nums = {1,0,1,1};
        int k = 1;
        System.out.println(containsNearbyDuplicate(nums,k));
        System.out.println(containsNearbyDuplicate2(nums,k));
    }
    public static boolean containsNearbyDuplicate2(int[] nums,int k){
        int n = nums.length;

        HashMap<Integer,Integer>map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            if(map.containsKey(nums[i])){
                if(Math.abs(i-map.get(nums[i])) <= k){
                    return true;
                }else{
                    map.remove(nums[i]);
                    map.put(nums[i],i);
                }
            }else{
                map.put(nums[i],i);
            }
        }
        return false;
    }
    public static boolean containsNearbyDuplicate(int[] nums, int k){
        int n = nums.length;

        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            if(map.containsKey(nums[i])){
                int maxInd = Integer.MIN_VALUE;
                for (Integer e:map.get(nums[i])) {
                    maxInd = Math.max(maxInd,e);
                }
                if(Math.abs(i-maxInd)<=k){
                    return true;
                }else{
                    map.get(nums[i]).add(i);
                }
            }
            else{
                map.put(nums[i],new ArrayList<>());
                map.get(nums[i]).add(i);
            }
        }
        System.out.println(map);
        return false;
    }
}
