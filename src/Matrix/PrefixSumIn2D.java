package Matrix;

import java.util.Arrays;

public class PrefixSumIn2D {
    public static void main(String[] args) {
        int[][] mat = {{1,0,1},
                       {0,-2,3}};

        System.out.println(prefixSum(mat,2));
    }
    public static int prefixSum(int[][] mat,int k){
        int n = mat.length , m = mat[0].length ,ans = Integer.MIN_VALUE;

        int[][]pf = new int[n][m];

        pf[0][0] = mat[0][0];

        for (int row = 1; row < n; row++) {
            pf[row][0] = mat[row][0] + pf[row-1][0];
        }
        for (int col = 1; col < m; col++) {
            pf[0][col] = mat[0][col] + pf[0][col-1];
        }

        for (int i = 1; i <n ; i++) {
            for (int j = 1; j < m; j++) {
                pf[i][j] = mat[i][j] + pf[i-1][j] + pf[i][j-1] - pf[i-1][j-1];
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(pf[i][j] == k){
                    ans = pf[i][j];
                }
            }
        }
        return ans;


    }
}
