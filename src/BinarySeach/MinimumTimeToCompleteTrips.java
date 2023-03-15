package BinarySeach;

//https://leetcode.com/problems/minimum-time-to-complete-trips/description/
public class MinimumTimeToCompleteTrips {
    public static void main(String[] args) {
        int[]time = {1,2,3};
        int totalTrips = 5;
        System.out.println(minimumTime(time , totalTrips));
    }
    public static long minimumTime(int[] time, int totalTrips) {
        long lb = 1;
//        long ub = 100000000000000L;
        long ub = Integer.MAX_VALUE;
        for (int num : time) {
            ub = Math.min(ub, num);
        }
        ub = ub*totalTrips;
        long ans = 0;
        while (lb <= ub){
            long mid = lb+(ub-lb)/2;
            long trip = getTrips(time, mid);

            if(trip >= totalTrips){
                ans = mid;
                ub = mid - 1;
            }
            else{
                lb = mid+1;

            }
        }
        return ans;
    }
    private static long getTrips(int[] time, long mid){
        long sum = 0;
        for (int num : time){
            sum += mid/num;
        }
        return sum;
    }
}
