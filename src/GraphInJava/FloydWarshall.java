package GraphInJava;

import java.util.Arrays;

//https://practice.geeksforgeeks.org/problems/implementing-floyd-warshall2042/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=implementing-floyd-warshall

public class FloydWarshall {
    public static void floydWarshall(int[][]matrix){    //T(N) = O(N^3)
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(matrix[i][j] == -1){
                    matrix[i][j] = (int)1e9;
                }
                if(i == j)matrix[i][j] = 0;
            }
        }

        //floyd Warshall algo

        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = Math.min(matrix[i][j],matrix[i][k]+matrix[k][j]);
                }
            }
        }

        for (int i = 0; i < n; i++) {
            if(matrix[i][i] < 0){
                System.out.println("Negative Cycle Exit");
            }
        }

        //for return the ans

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(matrix[i][j] == (int)1e9){
                    matrix[i][j] = -1;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[][]matrix = {{0,1,43},{1,0,6},{-1,-1,0}};
        floydWarshall(matrix);
        System.out.println(Arrays.deepToString(matrix));
        
    }
}
