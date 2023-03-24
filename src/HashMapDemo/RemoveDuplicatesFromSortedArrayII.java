package HashMapDemo;

//https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/


import java.util.Map;
import java.util.TreeMap;

public class RemoveDuplicatesFromSortedArrayII {
    public static void main(String[] args) {
        int[]nums = {1,1,1,2,2,3};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        TreeMap<Integer,Integer>map = new TreeMap<>();

        for (int e:nums) {
            if(map.containsKey(e)){
                map.put(e,map.get(e)+1);
            }
            else
                map.put(e,1);
        }
        int ind = 0;

        for (Map.Entry<Integer,Integer>m : map.entrySet()) {
            for (int i = 0; i < m.getValue() && i<2; i++) {
                nums[ind++] = m.getKey();
            }

        }

        return ind;
    }
}
