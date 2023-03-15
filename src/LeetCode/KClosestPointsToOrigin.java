package LeetCode;

import java.util.PriorityQueue;

//https://leetcode.com/problems/k-closest-points-to-origin/
public class KClosestPointsToOrigin {
    public static void main(String[] args) {
        int[][] points = {{1,3},{-2,-2}};
        int k = 1;
        System.out.println(kClosest(points,k));
    }
    public static int[][] kClosest(int[][] points, int k) {
        int[][] ans = new int[k][];
        PriorityQueue<Double> pq = new PriorityQueue<>();
        double dist = -1;
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j<points[0].length-1 && j < points[i].length; j++) {
                 dist =  Math.sqrt(Math.pow(points[i][j],2)+Math.pow(points[i][j+1],2));
                 pq.add(dist);
            }
        }
        System.out.println(pq);
        return ans;
    }
}
