package Array;
import java.util.*;
public class ThreeMultiply {
    public static void main(String[] args) {
        int[] nums = {1, 4, 6, 2, 3, 8};
        int k = 24;
        System.out.println(threeMultiply(nums,k));
    }
    public static List<List<Integer>> threeMultiply(int[] nums,int target){
        List<List<Integer>> outer = new LinkedList<>();
        Arrays.sort(nums);
        int n = nums.length;
        int count = 0;
        for (int i = 0; i < n-2; i++) {
            if(i>0 && nums[i] == nums[i-1])
                continue;

            int j = i+1;
            int k = n-1;

            while (j<k){
                if(nums[i]*nums[j]*nums[k] == target){
                    List<Integer> inner = new ArrayList<>();
                    inner.add(nums[i]);
                    inner.add(nums[j]);
                    inner.add(nums[k]);
                    count++;
                    outer.add(inner);
                    k--;

                    while (j<k && nums[k] == nums[k+1]){
                        k--;
                    }
                }
                else if(nums[i]*nums[j]*nums[k]>target) k--;
                else j++;

            }

        }
        System.out.println(count);
        return outer;
    }
}
