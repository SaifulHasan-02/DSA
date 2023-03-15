package Permutation;
import java.util.ArrayList;
import java.util.List;
public class Permutations {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(permuteUnique(nums));
    }
    public static List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>>outer = new ArrayList<>();
        List<Integer>inner = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];
        permute(nums, outer, inner, visited);
        return outer;
    }
    private static void permute(int[]nums, List<List<Integer>>outer, List<Integer>inner, boolean[]visited){
        if(inner.size() == nums.length){
            outer.add(new ArrayList<>(inner));
            return;
        }
        for(int i = 0; i < nums.length; i++){
            if(!visited[i]){
                visited[i] = true;
                inner.add(nums[i]);
                permute(nums, outer, inner, visited);
                inner.remove(inner.size()-1);
                visited[i] = false;
            }
        }

    }
}
