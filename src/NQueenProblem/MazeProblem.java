package NQueenProblem;


import java.util.ArrayList;
import java.util.Arrays;

public class MazeProblem {
    public static void main(String[] args) {
        int n = 3;
        int m  = 3;
        boolean[][] maze = new boolean[n][m];

        int[][] dp = new int[n][m];
        for (int[] arr : dp){
            Arrays.fill(arr,-1);
        }
//        for (int[] arr:dp) {
//            for(int r: arr){
//                System.out.print(r+" ");
//            }
//            System.out.println();
//        }
//        System.out.println(countPath(maze,n-1,m-1,dp));
        System.out.println(path("",n-1,m-1));
    }
    public static ArrayList<String > path(String p, int row, int col){
        if(row == 0 && col == 0){
            ArrayList<String> inner = new ArrayList<>();
            inner.add(p);
            return inner;
        }

        ArrayList<String> ans = new ArrayList<>();
        if(row > 0) {
            ArrayList<String> ver =path(p + "V", row - 1, col);
            ans.addAll(ver);

        }
        if(row>0 && col >0){
            ArrayList<String>dia = path(p+"D",row-1,col-1);
            ans.addAll(dia);
        }
        if(col > 0) {
            ArrayList<String> hor = path(p + "H", row, col - 1);
            ans.addAll(hor);
        }
        return ans;


    }
    public static int countPath(boolean[][]maze,int row,int col,int[][]dp){
        if(row == 0 || col == 0){
            return 1;
        }
        if(dp[row][col] != -1){
            return dp[row][col];
        }
        int down = countPath(maze,row-1,col,dp);
        int right = countPath(maze,row,col-1,dp);
        dp[row][col] = down+right;
        return dp[row][col];

    }
}
