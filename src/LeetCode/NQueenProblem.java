package LeetCode;

// https://leetcode.com/problems/n-queens/
import java.util.LinkedList;
import java.util.List;

public class NQueenProblem {
    public static void main(String[] args) {
        boolean[][] board = new boolean[4][4];
        List<List<String>>ans = new LinkedList<>();
        System.out.println(nQueen(board,0,ans));
    }

    public static List<List<String>> nQueen(boolean[][] board,int row,List<List<String>> ans){

        if(row == board.length){
            List<String> inner = new LinkedList<>();
            for (boolean[] b:board) {
                String p = "";
                for (boolean e: b) {
                    if(e){
                        p = p + "Q";
                    }else{
                        p = p + ".";
                    }
                }
                inner.add(p);
            }
            ans.add(inner);
            return ans;
        }

        for (int col = 0; col < board[row].length; col++) {
            if(isSafe(board,row,col)){
                board[row][col] = true;
                ans = nQueen(board,row+1,ans);
                board[row][col] = false;
            }

        }
        return ans;
    }
    /*
    public static void presentation(boolean[][] board,List<List<String>>ans){


    }

     */
    public static boolean isSafe(boolean[][] board,int r,int c){
        //vertical diagonal
        for (int i = 0; i < r; i++) {
            if (board[i][c]){
                return false;
            }
        }
        //left diagonal
        int m = Math.min(r,c);
        for (int i = 1; i <= m ; i++) {
            if(board[r-i][c-i]){
                return false;
            }
        }
        //for right diagonal
        int n = Math.min(board.length-c-1,r);
        for (int i = 1; i <= n ; i++) {
            if(board[r-i][c+i]){
                return false;
            }
        }
        return true;
    }
    /*
    public static List<List<String>> display(boolean[][] board,int r){

        List<List<String>> outer = new LinkedList<>();
        for (int i = 0; i < r; i++) {
            List<String>inner = new LinkedList<>();
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j]) {
                    inner.add("Q");
                } else {
                    inner.add(".");
                }

            }
            outer.add(inner);
        }
        return outer;

    }

     */
}
