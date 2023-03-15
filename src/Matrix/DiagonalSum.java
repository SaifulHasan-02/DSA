package Matrix;

public class DiagonalSum {
    public static void main(String[] args) {
        int[][] mat = {{1,2,3},
                {4,5,6},
                {7,8,9}

        };
        System.out.println(getSum(mat));
        System.out.println(getSumOpt(mat));
    }

    private static int getSumOpt(int[][] mat) {
        int sumP = 0;
        int sumS = 0;
        int n = mat.length;
        for (int i = 0; i < n; i++) {
            sumP += mat[i][i];
            sumS += mat[i][n-i-1];
        }
        if(n%2 != 0){
            return sumP+sumS-mat[n/2][n/2];
        }
        return sumP+sumS;
    }

    public static int getSum(int[][] mat){  //O(n2)
        int n = mat.length;
        int sumP = 0;
        int sumS = 0;
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < mat[0].length; j++) {
                if (i ==j){
                    sumP += mat[i][j];
                }else if((i+j) == (n-1)){
                    sumS += mat[i][j];
                }
            }
        }

        return sumP+sumS;
    }
}
