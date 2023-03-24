package GreedyAlgorithm;
//https://leetcode.com/problems/maximum-performance-of-a-team/

import java.util.Arrays;
import java.util.PriorityQueue;

public class MaximumPerformanceOfATeam {
    public static void main(String[] args) {
        int[] speed = {2, 10, 3, 1, 5, 8};
        int[] efficiency = {5, 4, 3, 9, 7, 2};
        int k = 2;
//        System.out.println(maxPerformance(speed.length, speed, efficiency, k));
        System.out.println(maxPerformance2(speed.length, speed, efficiency, k));

    }
    public static int maxPerformance2(int n,int[] speed,int[] efficiency,int k){
        int[][]mat = new int[n][2];
        for (int i = 0; i < n; i++) {
            mat[i][0] = efficiency[i];
            mat[i][1] = speed[i];
        }


        Arrays.sort(mat,(a,b) -> a[0]-b[0]);

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        long ans = Integer.MIN_VALUE,sumOfSpeed = 0;

        for (int i = n-1; i >=0 ; i--) {
            sumOfSpeed += mat[i][1];
            pq.offer(mat[i][1]);
            if(pq.size()>k){
                sumOfSpeed -= pq.poll();
            }
            ans = Math.max(ans,sumOfSpeed*mat[i][0]);
        }

        return (int)(ans%1000000007);
    }

    public static int maxPerformance(int n, int[] speed, int[] efficiency, int k) {
        int[][] mat = new int[n][2];
        for (int i = 0; i < n; i++) {
            mat[i] = new int[]{efficiency[i],speed[i]};
        }

        Arrays.sort(mat, (a, b) -> (a[0]==b[0])? a[1] - b[1] : b[0] - a[0]);

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        long ans = Integer.MIN_VALUE, sumOfSpeed = 0;
        for (int i = 0; i<n ; i++) {
            sumOfSpeed += mat[i][1];
            pq.offer(mat[i][1]);
            if(pq.size()>k){
                sumOfSpeed -= pq.poll();
            }
            ans = Math.max(ans,sumOfSpeed*mat[i][0]);
        }

        return (int)(ans%1000000007);
    }
}
