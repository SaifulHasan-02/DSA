package HashMapDemo;

import java.util.*;

public class FindDupInArray {
    public static void main(String[] args) {
        int[] arr = {1,1,2};
        System.out.println(findDuplicates(arr));
        System.out.println(findDup(arr));

    }

    public static List<Integer> findDuplicates(int[] nums) {

        List<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        for (Map.Entry e : map.entrySet()) {
            if((int)e.getValue()>1){
                list.add((int)e.getKey());
            }

        }
        return list;
    }
    public static List<Integer> findDup(int[] arr){
        List<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if(set.contains(arr[i])){
                list.add(arr[i]);
            }else{
                set.add(arr[i]);
            }
        }
        return list;

    }
}
