package Array;

//https://leetcode.com/problems/single-number-ii/

import java.util.HashMap;
import java.util.Map;

public class SingleNumberII {
    public static void main(String[] args) {
        int[]nums = {2,2,3,2,4,4,4,5,5,5};
//        System.out.println(singleNumber(nums));
        System.out.println(singleNumber2(nums));
    }
    public static int singleNumber2(int[] nums){
        HashMap<Integer,Integer>map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        System.out.println(map);
        for(Map.Entry<Integer,Integer>m : map.entrySet()){
            if(m.getValue() == 1){
                return m.getValue();
            }
        }
        return -1;

    }
    public static int singleNumber(int[] nums){
        int n = nums.length;
        int ans = 0;

        for (int i = 0; i < 32; i++) {
            int count = 0;

            for (int j = 0; j < n; j++) {
                int temp = nums[j] >> i;
                if((temp & 1) == 1){
                    count++;
                }
            }
            count %= 3;
            if(count != 0) {
                count = count << i;
                ans = ans | count;
            }

        }
        return ans;
    }

}
