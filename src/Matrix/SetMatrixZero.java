package Matrix;

import java.util.Arrays;

public class SetMatrixZero {
    public static void main(String[] args) {

        int[][] matrix = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        for (int[] e:matrix) {
            for (int i:e) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
        System.out.println();
//        setZeroes(matrix);    //Galat ho gya q leeetcode
        setZeroes2(matrix);  // shi hai laikn Space complexity O(N+M) hai
        setZeroes3(matrix); //nhi hua hai
        for (int[] e:matrix) {
            for (int i:e) {
                System.out.print(i+" ");
            }
            System.out.println();
        }

    }
    public static void setZeroes3(int[][] matrix){
        int n = matrix.length;
        int m = matrix[0].length;
        int r = 0;

        for (int i = 0; i < n; i++) {
            int c = 0;
            for (int j = 0; j < m; j++) {
                if(matrix[r][c] == 0){
                    matrix[i][j] = 0;
                }
                c++;
            }
            r++;
        }
    }
    public static void setZeroes2(int[][] matrix){
        int n = matrix.length;
        int m = matrix[0].length;

        int[] row = new int[n];
        Arrays.fill(row,-1);
        int[] col = new int[m];
        Arrays.fill(col,-1);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(matrix[i][j] == 0){
                    row[i] = 0;
                    col[j] = 0;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(row[i] == 0 || col[j] == 0){
                    matrix[i][j] = 0;
                }
            }
        }
    }

    public static void setZeroes(int[][] matrix) {

        for(int i = 0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j] == 0){
                    makeZero(matrix,i,j);

                }
            }
        }
        for(int i = 0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j] == Integer.MAX_VALUE){
                    matrix[i][j] = 0;

                }
            }
        }
    }
    public static void makeZero(int[][] mat,int r,int c){
        //for upper straight
        for(int i = 0;i<r;i++){
            if(mat[i][c] != 0)
                mat[i][c] = Integer.MAX_VALUE;
        }
        //for down staright
        for(int i = r+1;i<mat.length;i++){
            if(mat[i][c] != 0)
               mat[i][c] = Integer.MAX_VALUE;
        }
        //for left straight
        for (int i = 0; i < c; i++) {
            if(mat[r][i] != 0)
                mat[r][i] = Integer.MAX_VALUE;
        }
        //for right striaght

        for (int i = c+1;c<=mat[r].length-2 && i <mat[r].length ; i++) {
            if(mat[r][i] != 0)
                mat[r][i] = Integer.MAX_VALUE;
        }
    }
}
