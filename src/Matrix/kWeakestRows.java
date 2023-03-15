package Matrix;

import java.util.*;

public class kWeakestRows {
    public static void main(String[] args) {
        int[][] mat = {{1,1,0,0,0},
        {1,1,1,1,0},
        {1,0,0,0,0},
        {1,1,0,0,0},
        {1,1,1,1,1}};
        int k = 3;
        System.out.println(Arrays.toString(kWeakestRows1(mat,k)));
    }
    public static int[] kWeakestRows1(int[][] mat, int k) {
        int[] ans = new int[k];
        int[] arr = new int[mat.length];
        int z = 0;
        for(int i=0;i<mat.length;i++){
            int count = 0;
            for(int j=0;j<mat[i].length;j++){
                if(mat[i][j]==1){
                    count++;
                }else{
                    break;
                }
            }
            arr[z]=count;
            z++;
        }

        int a =0;
        int length = k;
        while(length>0){
            int min = 0;
            for (int i = 0; i < arr.length; i++) {
                if(arr[i]<arr[min]){
                    min = i;
                }
            }
            ans[a] = min;
            a++;
            arr[min] = Integer.MAX_VALUE;
            length--;
        }

        return ans;
    }
}
