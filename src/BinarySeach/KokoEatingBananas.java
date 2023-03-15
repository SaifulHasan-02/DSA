package BinarySeach;
//https://leetcode.com/problems/koko-eating-bananas/description/
public class KokoEatingBananas {
    public static void main(String[] args) {
        int[] piles = {312884470};
        int h = 312884469;
        System.out.println(minEatingSpeed(piles, h)); // nhi pta q glt de rha hai
        System.out.println(minEatingSpeed2(piles, h));

    }
    public static int minEatingSpeed(int[] piles, int h) {
        int lb = 1, ub = Integer.MIN_VALUE;
        for(int pile : piles){
            ub = Math.max(ub, pile);
        }
        int ans = 0;
        for (int i = 1; i <= ub ; i++) {
            long time = getTimeTaken(i, piles);
            if(time == h){
                ans = i;
                break;
            }
        }
        return ans;
    }
    public static int minEatingSpeed2(int[] piles, int h) {
        int lb = 1, ub = Integer.MIN_VALUE;

        for(int pile : piles){
            ub = Math.max(ub, pile);
        }

        int ans = 0;
        while (lb <= ub){
            int mid = lb + (ub - lb)/2;
            long time = getTimeTaken(mid, piles);
            if(time <= h){
                ans = mid;
                ub = mid-1;
            }
            else{
                lb = mid+1;
            }
        }
        return ans;
    }
    private static long getTimeTaken(int i, int[] piles) {
        long sum = 0;
        for (int pile : piles) {
            sum = sum + (pile/i);
            if(pile % i != 0){
                sum++;
            }
        }

        return sum;
    }

}
