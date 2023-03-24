package Array;

//https://leetcode.com/problems/maximum-number-of-pairs-in-array/


import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class MaximumNumberOfPairsInArray {
    public static void main(String[] args) {
        int[]nums = {5,12,53,22,7,59,41,54,71,24,91,74,62,47,20,14,73,11,82,2,15,38,38,20,57,70,86,93,38,75,94,19,36,40,28,6,35,86,38,94,4,90,18,87,24,22};
        System.out.println(Arrays.toString(numberOfPairs(nums)));
        System.out.println(Arrays.toString(numberOfPairs2(nums)));

    }
    public static int[] numberOfPairs2(int[] nums){
        int[]ans = new int[2];
        HashSet<Integer>set = new HashSet<>();
        int count = 0;
        for (int e:nums) {
            if(set.contains(e)){
                count++;
                set.remove(e);
            }
            else{
                set.add(e);
            }
        }
        ans[0] = count;
        ans[1] = set.size();
        return ans;
    }
    public static int[] numberOfPairs(int[] nums) {
        int[]ans = new int[2];

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int e : nums){
            map.put(e,map.getOrDefault(e,0)+1);
        }
        System.out.println(map);

        int countPair = 0,count = 0;
        for(Map.Entry<Integer,Integer>m : map.entrySet()){
//            if(m.getValue() > 1){
//                countPair++;
//                map.put(m.getKey(),m.getValue()-2);
//            }
            while (m.getValue()>1){
                countPair++;
                map.put(m.getKey(),m.getValue()-2);
            }
            if(m.getValue() == 1){
                count++;
            }
        }
        ans[0] = countPair;
        ans[1] = count;
        return ans;
    }
}
