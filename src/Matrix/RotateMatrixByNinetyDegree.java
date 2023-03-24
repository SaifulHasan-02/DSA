package Matrix;

public class RotateMatrixByNinetyDegree {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] ans = rotate(matrix);
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[i].length; j++) {
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int[][] rotate(int[][] mat){

        //Taking transpose of matrix
        int[][] tArray = new int[mat.length][mat[0].length];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                tArray[j][i] = mat[i][j];
            }
        }

        //then reverse it
        int[][] ans = reverse(tArray);
        return ans;
    }
    public static int[][] reverse(int[][] mat){
        for (int i = 0; i < mat.length; i++) {
            int start = 0;
            int end = mat[i].length-1;
            while(start < end) {
                int temp = mat[i][start];
                mat[i][start] = mat[i][end];
                mat[i][end] = temp;
                start++;
                end --;
            }
        }
        return mat;
    }
}
