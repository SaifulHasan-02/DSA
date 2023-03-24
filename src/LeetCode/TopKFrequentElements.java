package LeetCode;
import java.util.*;

public class TopKFrequentElements{
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        int k = 2;
        System.out.println(Arrays.toString(topKFrequent(nums,k)));

    }
    public static int[] topKFrequent(int[] nums, int k) {
        int[] ans = new int[k];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
        }

        LinkedList<Map.Entry<Integer,Integer>> list = new LinkedList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue());
        System.out.println(list);
        int i = list.size()-1;
        int z = 0;
        while (k>0){
            ans[z] = list.get(i).getKey();
            z++;
            i--;
            k--;
        }
        return ans;

    }
}
