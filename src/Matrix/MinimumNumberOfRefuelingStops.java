package Matrix;

//https://leetcode.com/problems/minimum-number-of-refueling-stops/

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import java.util.PriorityQueue;

public class MinimumNumberOfRefuelingStops {
    public static void main(String[] args) {
        int[][]stations = {{5,100},{997,100},{998,100}};
        int target = 999;
        int startFuel = 1000;
//        System.out.println(minRefuelStops(target,startFuel,stations));
        System.out.println(minRefuelStops2(target,startFuel,stations));

    }
    public static int minRefuelStops2(int target, int startFuel, int[][] stations){
        int n = stations.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a);
        int stop = 0;
        int dis = startFuel;
        int i = 0;
        while (true){
            while (i<n && stations[i][0] <= dis){
                pq.offer(stations[i++][1]);
            }
            if(pq.isEmpty())return -1;
            if (dis>=target)return stop;
            dis -= pq.poll();
            stop++;

        }


    }

    public static int minRefuelStops(int target, int startFuel, int[][] stations) {
        if(target == startFuel)return 0;

        else if(target>startFuel && startFuel < stations[0][0])
            return -1;

        int n = stations.length;
        Arrays.sort(stations, (a,b) -> b[1]-a[1]);

        int stop = 0;
        target = target-startFuel;
        if(target <=0)return 0;
        int currPos = startFuel;
        for (int i = 0; i < n; i++) {
            if(currPos <= stations[i][0]){
                currPos = currPos-stations[i][1];
                target = target - stations[i][1];
                stop++;
                if(target<=0){
                    return stop;
                }


            }
        }
        return -1;

    }
}
