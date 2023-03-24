package Matrix;
//https://leetcode.com/problems/sort-the-matrix-diagonally/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortTheMatrixDiagonally {
    public static void main(String[] args) {
        int[][] mat = {{3,3,1,1},{2,2,1,2},{1,1,1,2}};
        System.out.println(Arrays.deepToString(diagonalSort(mat)));
    }
    public static int[][] diagonalSort(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;

        for (int col = 0; col < m; col++) {
//            sort(mat,0,col,n,m);
            countingSort(mat,0,col,n,m);
        }

        for (int row = 1; row < n; row++) {
//            sort(mat,row,0,n,m);
            countingSort(mat,row,0,n,m);
        }
        return mat;
    }public static void countingSort(int[][]mat,int row,int col,int n,int m){   // T(n) = O(n) ,S(n) = O(n)
        int[] arr = new int[101];
        int r = row, c = col ;
        while (r < n && c < m){
            arr[mat[r][c]]++;
            r++;
            c++;
        }
        r = row;
        c = col;
        for (int i = 1; i < 101; i++) {
            while (arr[i]>0){
                mat[r][c] = i;
                r++;
                c++;
                arr[i]--;
            }
        }


    }
    public static void sort(int[][]mat,int row,int col,int n,int m){ // T(n) = O(nlog(n)) ,S(n) = O(n)
        ArrayList<Integer> list = new ArrayList<>();
        int r = row , c = col;

        while (r < n && c < m){
            list.add(mat[r][c]);
            r++;
            c++;
        }
        Collections.sort(list);
        r = row;
        c = col;
        int ind = 0;
        while (r<n && c< m){
            mat[r][c] = list.get(ind);
            ind++;
            r++;
            c++;
        }

    }
}
