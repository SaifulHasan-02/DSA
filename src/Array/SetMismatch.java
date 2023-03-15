package Array;

//https://leetcode.com/problems/set-mismatch/

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class SetMismatch {
    public static void main(String[] args) {
        int[]nums = {1,5,3,2,2,7,6,4,8,9};
        System.out.println(Arrays.toString(findErrorNums(nums)));
        System.out.println(Arrays.toString(findErrorNums2(nums)));

    }
    public static int[] findErrorNums2(int[] nums){
        int[] ans = new int[2];
        HashSet<Integer>set = new HashSet<>();
        for(int e : nums){
            if(set.contains(e)){
                ans[0] = e;
            }
            set.add(e);
        }

        for (int i = 1; i <= nums.length; i++) {
            if(!set.contains(i)){
                ans[1] = i;
                break;
            }
        }
        return ans;

    }
    public static int[] findErrorNums(int[] nums){
        int[] ans = new int[2];

        HashMap<Integer,Integer>map = new HashMap<>();

        for (int e:nums) {
            map.put(e,map.getOrDefault(e,0)+1);
        }
        for(Map.Entry<Integer,Integer>m : map.entrySet()){
            if(m.getValue()>1){
                ans[0] = m.getKey();
            }
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if(i+1 != nums[i] && !map.containsKey(i+1)){
                ans[1] = i+1;
                break;
            }
        }
        return ans;


    }

}
