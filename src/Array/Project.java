package Array;

import java.util.ArrayList;
import java.util.List;

public class Project {
    public static void main(String[] args) {
        int[] projC = {7,2,3};
        int[] product = {43,345,20,987};
        System.out.println(getOrder(product));
        System.out.println(workingWeeks(projC));

    }
    public static List<Integer> getOrder(int[]product){
        List<Integer> ans = new ArrayList<>();

        for (int n : product){
            int sum = 0;
            while (n != 0){
                int r = n%10;
                sum = sum + r;
                n/=10;
            }
            ans.add(sum);
        }
        return ans;
    }
    public static int workingWeeks(int[] projC){
        int maxMod = 0, sum = 0, leftSum;
        for (int m : projC) {
            sum += m;
            if (m > maxMod) maxMod = m;
        }
        leftSum = sum - maxMod;
        return leftSum + Math.min(maxMod, leftSum + 1);
    }

}
