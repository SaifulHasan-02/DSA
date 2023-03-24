package Comparator;
//https://leetcode.com/problems/queue-reconstruction-by-height/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.*;

public class QueueReconstructionByHeight {
    public static void main(String[] args) {
        int[][] people = {{7,0},{4,4},{7,1},{5,0},{6,1},{5,2}};
        int[][] ans = reconstructQueue(people);
        for (int[] p:ans) {
            for (int e: p) {
                System.out.print(e+" ");
            }
            System.out.println();
        }

    }
    public static int[][] reconstructQueue(int[][] people){
        Arrays.sort(people,new Comparator<int[]>(){
            public int compare(int[] a,int[] b){
                if(b[0] == a[0]){
                    return a[1]-b[1];
                }
                return b[0]-a[0];
            }
        });
        List<int[]>list = new ArrayList<>();
        for(int[] p : people){
            list.add(p[1],p);
        }
        /*
        int[][] ans = new int[people.length][2];

        int i =0;
        for(int[] p : list){
            int j =0;
            for(int e : p){
                ans[i][j] = e;
                j++;
            }
            i++;
        }
        return ans;

         */
       return list.toArray(new int[people.length][2]);
    }
}
