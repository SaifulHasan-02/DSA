package Array;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
        System.out.println(majorityElement2(nums));

    }
    public static int majorityElement2(int[] nums){
        HashMap<Integer,Integer>map = new HashMap<>();

        for (int e:nums) {
            map.put(e,map.getOrDefault(e,0)+1);
        }

        for(Map.Entry<Integer,Integer>m : map.entrySet()){
            if(m.getValue()> nums.length/2){
                return m.getKey();
            }
        }
        return -1;
    }
    public static int majorityElement(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length-1; i++) {
            for (int j = 0;  j < nums.length; j++) {
                if(i != j) {
                    if (nums[i] == nums[j]) {
                        count++;
                    }
                }
            }

            if(count > nums.length/2){
                return nums[i];
            }
        }
        return -1;
    }
}
