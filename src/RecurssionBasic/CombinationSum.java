package RecurssionBasic;
//https://leetcode.com/problems/combination-sum/description/

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class CombinationSum {
    public static void main(String[] args) {
        int[]nums = {2,3,6,7};
        int target = 7;
        System.out.println(combinationSum(nums, target));
    }
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> outer = new ArrayList<>();
        List<Integer>list = new ArrayList<>();
        combination(0, candidates, target, list, outer);
        return outer;
    }
    private static void combination(int ind, int[]nums, int target, List<Integer>list, List<List<Integer>>outer){
        if(ind == nums.length){
            return;
        }
        if(target == 0){
            outer.add(new ArrayList<>(list));
            return;
        }
        if(target<0)return;

        list.add(nums[ind]);
        combination(ind,nums,target-nums[ind], list, outer);
        list.remove(list.size()-1);
        combination(ind+1,nums,target,list,outer);
    }
}
