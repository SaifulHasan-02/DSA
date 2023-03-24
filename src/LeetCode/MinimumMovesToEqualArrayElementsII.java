package LeetCode;
//https://leetcode.com/problems/minimum-moves-to-equal-array-elements-ii/
import QueueDS.PriorityQueueDemo;

import java.util.*;
public class MinimumMovesToEqualArrayElementsII {
    public static void main(String[] args) {
        int[] nums = {1,2};
        System.out.println(minMoves2(nums));    //O(n*log(n))
        System.out.println(minMoves(nums));     //O(n*log(n))
        //System.out.println(minMovesOpt(nums)); //quick select se krna hoga //O(n)
    }
    public static int minMoves(int[] nums){
        int n = nums.length;
        PriorityQueue<Integer> pq =  new PriorityQueue<Integer>();
        for (int e: nums) {
            pq.offer(e);
        }

        for(int i =0;i<(n/2);i++){
            pq.poll();
        }
        int pivot = pq.poll();
        System.out.println(pivot);
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans = ans +(Math.abs(pivot-nums[i]));
        }
        return ans;

    }
    public static int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int mid = n/2;
        int ans = 0;
        for(int i=0;i<n;i++){
            if(i != mid ) ans = ans + (Math.abs(nums[mid] - nums[i]));
        }
        return ans;

    }
}
