package Comparator;

import java.util.Arrays;
import java.util.Comparator;

//https://leetcode.com/problems/maximum-units-on-a-truck/
public class MaximumUnitsOnATruck {
    public static void main(String[] args) {    //[[1,3],[2,2],[3,1]] ,4
        int[][] boxTypes = {{1,3},{2,2},{3,1}};
        int truckSize = 4;
        System.out.println(maximumUnits(boxTypes,truckSize));

    }

    public static int maximumUnits(int[][] boxTypes, int truckSize) {

        Arrays.sort(boxTypes, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o2[1]-o1[1];
            }
        });
        for (int i = 0; i < boxTypes.length; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(boxTypes[i][j]+" ");
            }
            System.out.println();
        }

        int ans = 0;
        int count = 0;
        for (int i = 0; i < boxTypes.length; i++) {
            if(count < truckSize){
                ans = ans + boxTypes[i][0]*boxTypes[i][1];
                count = count+boxTypes[i][0];
            }
            if(count>truckSize){
                int diff = count-truckSize;
                if(boxTypes[i][0] >= diff){
                    ans = ans - diff*boxTypes[i][1];
                    count = count-diff;
                }

            }
        }
        return ans;

    }
}
