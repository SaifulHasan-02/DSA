package Array;
import java.util.Arrays;
import java.util.*;
public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {3,2,4};
        int target = 6 ;
        System.out.println(Arrays.toString(twoSum(arr, target)));
        System.out.println(twoSum2(arr,target));
        System.out.println(twoSum3(arr,target));

    }
    public static ArrayList<Integer> twoSum3(int[] num,int target){
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < num.length; i++) {
            if(map.containsKey(target-num[i])){
                list.add(target-num[i]);
                list.add(num[i]);
            }
            map.put(num[i],i);
        }
        return list;
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] ans = {-1, -1};
        Arrays.sort(nums);
        int i = 0;
        int j = nums.length - 1;
        while (i < j) {
            if (nums[i] + nums[j] > target) {
                j--;
            } else if (nums[i] + nums[j] < target) {
                i++;
            } else {
                ans[0] = nums[i];
                ans[1] = nums[j];
                return ans;
            }
        }
        return ans;

    }

    public static ArrayList<ArrayList<Integer>> twoSum2(int[] nums, int target) {
        ArrayList<ArrayList<Integer>> Majorlist = new ArrayList<ArrayList<Integer>>();
        Arrays.sort(nums);
        int i = 0;
        int j = nums.length - 1;
        while (i < j) {

            if(nums[i] + nums[j] == target) {
                if(nums[i]==nums[i+1] ){
                    i++;
                    continue;
                }
                if(nums[j]==nums[j-1]){
                    j--;
                    continue;
                }
                ArrayList<Integer> list = new ArrayList<>();
                list.add(nums[i]);
                list.add(nums[j]);
                Majorlist.add(list);
                i++;
            }
            else if (nums[i] + nums[j] > target) {
                if(nums[j]==nums[j-1]){
                    j--;
                    continue;
                }
                j--;
            } else  {
                if(nums[i]==nums[i+1]){
                    i++;
                    continue;
                }
                i++;
            }
        }
        return Majorlist;
    }

}
