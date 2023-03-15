package Array;
import java.util.*;
//https://leetcode.com/problems/count-of-smaller-numbers-after-self/
public class CountOfSmallerNumbersAfterSelf {
    public static void main(String[] args) {
        int[] nums = {5,2,6,1};
        System.out.println(countSmaller(nums)); //TLE
        System.out.println(counSmaller2(nums));
    }
    public static List<Integer> countSmaller(int[] nums) {

        List<Integer> ans = new ArrayList<>();


        for(int i = 0;i<nums.length;i++){
            int count = 0;
            for(int j = i+1;j<nums.length;j++){
                if(nums[i]>nums[j]){
                    count++;
                }
            }
            ans.add(count);
        }
        return ans;

    }

    public static List<Integer> counSmaller2(int[] nums){
        List<Integer>ans = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],i);
        }
        int count = 0;
        for (int i = 0; i < nums.length; i++){


            ans.add(count);
        }
        return ans;
    }
}


