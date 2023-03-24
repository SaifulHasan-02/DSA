package Array;

//https://leetcode.com/problems/k-closest-points-to-origin/

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class KClosestPointsToOrigin {
    public static void main(String[] args) {
        int[][] points = {{-5,4},{-6,-5},{4,6}};
        int k = 2;
        System.out.println(Arrays.deepToString(kClosest(points,k)));
        System.out.println(Arrays.deepToString(kClosest2(points,k)));

    }
    public static int[][] kClosest2(int[][] points,int k){
        int[][]ans = new int[k][2];

        PriorityQueue<int[]>pq = new PriorityQueue<>((a,b)->(a[0]*a[0] + a[1]*a[1]) - (b[0]*b[0]+b[1]*b[1]));

        for (int[] arr:points) {
            pq.offer(arr);
        }
        for (int i = 0; i < k; i++) {
            ans[i][0] = pq.peek()[0];
            ans[i][1] = pq.peek()[1];
            pq.poll();
        }
        return ans;

    }



    public static class Node{
        int x,y;
        Node(int x,int y){
            this.x = x;
            this.y = y;
        }
    }

    public static int[][] kClosest(int[][] points, int k) {
        int[][] ans = new int[k][2];

        HashMap<Node,Double>map = new HashMap<>();

        PriorityQueue<Map.Entry<Node,Double>>pq = new PriorityQueue<>((a,b)->a.getValue().compareTo(b.getValue()));

        for (int[] arr: points) {
            double dis = Math.pow(arr[0],2) + Math.pow(arr[1],2);
            map.put(new Node(arr[0],arr[1]),Math.sqrt(dis));
        }
        for(Map.Entry<Node,Double>m : map.entrySet()){
            pq.offer(m);
        }

        for (int i = 0; i < k; i++) {
            ans[i][0] = pq.peek().getKey().x;
            ans[i][1] = pq.peek().getKey().y;
            pq.poll();
        }
        return ans;

    }
}
