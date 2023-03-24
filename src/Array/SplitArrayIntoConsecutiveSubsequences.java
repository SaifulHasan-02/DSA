package Array;

//https://leetcode.com/problems/split-array-into-consecutive-subsequences/

import java.util.*;

public class SplitArrayIntoConsecutiveSubsequences {
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,4,5};
        System.out.println(isPossible(arr));
    }
    public static boolean isPossible(int[] nums) {
        HashMap<Integer,Integer> freq = new HashMap<>();

        for (int e: nums){
            freq.put(e,freq.getOrDefault(e,0)+1);
        }
        HashMap<Integer,Integer> map = new HashMap<>();


        for (int e: nums){
            if(freq.get(e) == 0) {
                continue;
            }
            else if(map.getOrDefault(e,0)>0){
                map.put(e,map.get(e)-1);
                map.put(e+1,map.getOrDefault(e+1,0)+1);
                freq.put(e,freq.get(e)-1);
            }
            else if(freq.getOrDefault(e,0)>0 && freq.getOrDefault(e+1,0)>0 && freq.getOrDefault(e+2,0)>0){
                freq.put(e,freq.getOrDefault(e,0)-1);
                freq.put(e+1,freq.getOrDefault(e+1,0)-1);
                freq.put(e+2,freq.getOrDefault(e+2,0)-1);
                map.put(e+3,map.getOrDefault(e+3,0)+1);
            }
            else {
                return false;
            }
        }
        return true;
    }

}
