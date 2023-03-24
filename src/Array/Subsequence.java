package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Subsequence {
    public static void main(String[] args) {
        int[] nums = {-1,-2,3,4};
        int k = 3;
        //List<List<Integer>> list = getSub(nums);
        //System.out.println(list);
        //System.out.println(Arrays.toString(getMaxSum(list,k)));
         ArrayList<Integer>ans = new ArrayList<>();
         getSub2(nums,ans,0,nums.length);
    }
    public static int[] getMaxSum(List<List<Integer>> list,int k){
        int ind = 0;
        int count = 0;
        int maxSum = 0;
        for (List<Integer> l:list) {
            count++;
            if(l.size() == k){
                int sum = 0;
                for (Integer e:l) {
                    sum = sum + e;
                }
                if(sum>maxSum){
                    ind = count;
                    maxSum = sum;
                }
            }

        }
        int[] ans = new int[k];
        int i = 0;
        int c = 0;
        for (List<Integer> it:list) {
            c++;
            if(c== ind){
                for (Integer s:it) {
                    ans[i] = s;
                    i++;
                }
            }
        }
        return ans;
    }
    public static void getSub2(int[] nums,ArrayList<Integer>ans,int ind,int n){
        if(ind == n){
            for (Integer e:ans) {
                System.out.print(e+" ");
            }
            return;
        }
        ans.add(nums[ind]);
        getSub2(nums,ans,ind+1,n);
        ans.remove(nums[ind-1]);
        getSub2(nums,ans,ind+1,n);
    }
    public static List<List<Integer>> getSub(int[] nums){
        List<List<Integer>> list = new LinkedList<>();
        list.add(new ArrayList<>());
        for (Integer e:nums) {
            int n = list.size();
            for (int i = 0; i < n; i++) {
                List<Integer>inner = new ArrayList<>(list.get(i));
                inner.add(e);
                list.add(inner);

            }


        }
        return list;
    }

}
