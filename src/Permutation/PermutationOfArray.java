package Permutation;
import java.util.*;

//https://leetcode.com/problems/permutations-ii/
public class PermutationOfArray {
    public static void main(String[] args) {
        int[] arr = {1,1,2};
        List<Integer> inner = new ArrayList<>();
        List<List<Integer>> outer = new ArrayList<>();
        boolean[] visited = new boolean[arr.length];
        permutation(arr,inner,visited,outer);
        System.out.println(outer);
    }
    public static void permutation(int[] nums,List<Integer> inner,boolean[]visited,List<List<Integer>>outer){
        if(inner.size()== nums.length){
            if(!outer.contains(inner))
                outer.add(new ArrayList<>(inner));
            return ;
        }
        for (int i = 0; i < nums.length; i++) {
            if(!visited[i]){
                visited[i] = true;
                inner.add(nums[i]);
                permutation(nums,inner,visited,outer);
                inner.remove(inner.size()-1);
                visited[i] = false;
            }
        }
    }

}
