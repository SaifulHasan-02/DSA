package Matrix;

//https://leetcode.com/problems/rotate-image/

import java.util.Arrays;

public class RotateImage {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        rotate(matrix);//O(n^2) and O(n^2)
        rotateOpt(matrix); // O(n^2) and O(1)
    }
    public static void rotateOpt(int[][] mat){
        int n = mat.length;

        // inplace transpose
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }


        reverse(mat);

    }

    public static void rotate(int[][] matrix) {
        int n = matrix.length;
        int[][] tMat = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                tMat[j][i] = matrix[i][j];
            }
        }

        for (int[] arr:matrix){
            System.out.println(Arrays.toString(arr));
        }

        reverse(tMat);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = tMat[i][j];
            }
        }
        for (int[] arr:matrix){
            System.out.println(Arrays.toString(arr));
        }

    }
    public static void reverse(int[][] mat){
        for (int i = 0; i < mat.length; i++) {
            int s = 0;
            int e = mat.length - 1;

            while (s<e){
                int temp = mat[i][s];
                mat[i][s] = mat[i][e];
                mat[i][e] =  temp;
                s++;
                e--;
            }
        }
    }
}
