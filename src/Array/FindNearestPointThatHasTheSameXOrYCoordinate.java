package Array;


//https://leetcode.com/problems/find-nearest-point-that-has-the-same-x-or-y-coordinate/


import java.util.*;

public class FindNearestPointThatHasTheSameXOrYCoordinate {
    public static void main(String[] args) {
        int[][]points = {{1,2},{3,1},{2,4},{2,3},{4,4}};
        int x = 3, y = 4;
//        System.out.println(nearestValidPoint(x,y,points));
        System.out.println(nearestValidPoint2(x,y,points));
    }
    public static int nearestValidPoint2(int x,int y,int[][]points){
        int minDis = Integer.MAX_VALUE,ind = -1;
        for (int i = 0; i < points.length; i++) {
            if(x == points[i][0] || y == points[i][1]){
                int dis = Math.abs(x-points[i][0])+Math.abs(y-points[i][1]);
                if(dis <minDis){
                    minDis = dis;
                    ind = i;
                }
            }

        }
        return ind;


    }
    public static int nearestValidPoint(int x, int y, int[][] points) {//galat hai thora shi krna hoga

        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->(Math.abs(a[0]-x)+Math.abs(a[1]-y))-(Math.abs(b[0]-x)+Math.abs(b[1]-y)));

        for (int[]arr:points) {
            pq.offer(arr);
        }

        HashSet<int[]> set = new HashSet<>();
        int minDis = 0;
        while (!pq.isEmpty()){
            if(x == pq.peek()[0] || y == pq.peek()[1]){

                set.add(pq.poll());
            }
            else{
                pq.poll();
            }
        }
        if(set.size() == 0)
            return -1;

        int ind = 0;
        for (int[] arr:points) {
            if(set.contains(arr)){
                int dis = Math.abs(x-arr[0])+Math.abs(y-arr[1]);
                if(dis <= minDis)
                    return ind;
            }
            ind++;
        }

        return ind;
    }
}
