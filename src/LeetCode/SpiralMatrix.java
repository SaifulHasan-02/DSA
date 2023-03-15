package LeetCode;

public class SpiralMatrix {
    public static void main(String[] args) {
        int n = 3;
        int[][]ans = generateMatrix(n);

        for (int[] arr:ans) {
            for (int e:arr) {
                System.out.print(e+" ");
            }
            System.out.println();
        }
    }
    public static int[][] generateMatrix(int n) {
        int[][] ans = new int[n][n];
        int rStart = 0;
        int rEnd = n-1;
        int cStart = 0;
        int cEnd = n-1;
        int count = 1;
        while (rStart <= rEnd && cStart <= cEnd){
            for (int i = cStart; i <= cEnd; i++) {
                ans[rStart][i] = count;
                count++;
            }
            rStart++;
            for (int i = rStart; i <= rEnd; i++) {
                ans[i][cEnd] = count;
                count++;
            }
            cEnd--;
            for (int i = cEnd; i >=cStart  ; i--) {
                ans[rEnd][i] = count;
                count++;
            }
            rEnd--;
            for (int i = rEnd; i >= rStart ; i--) {
                ans[i][cStart] = count;
                count++;
            }
            cStart++;
        }
        return ans;
    }
}
