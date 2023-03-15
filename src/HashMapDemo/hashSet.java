package HashMapDemo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class hashSet {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,3,4,4,4,4,5,5,5};
        HashSet<Integer> set = new HashSet<>();
        for(int i =0;i<arr.length;i++){
            set.add(arr[i]);
        }
        for(int e : set){
            System.out.println(e);
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i],i);
        }
        int[] nums = new int[map.size()];
        int i =0;
        for(Map.Entry e : map.entrySet()){
            nums[i] =(int)e.getKey();
            i++;
        }
        System.out.println(Arrays.toString(nums));
    }
}
