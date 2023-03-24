package NQueenProblem;


import java.util.ArrayList;
import java.util.List;

public class NQueens {
    public static void main(String[] args) {
        boolean[][] arr = new boolean[4][4];
        System.out.println(queens(arr,0));
    }
    public static int queens(boolean[][] arr,int row){
        if(row == arr.length){
            display(arr);
            return 1;
        }
        int count = 0;

        for(int i = 0;i<arr[0].length;i++){
            if(isSafe(arr,row,i) ){
                arr[row][i] = true;
                count = count + queens(arr,row+1);
                arr[row][i] = false;
            }

        }
        return count;

    }
    public static boolean isSafe(boolean[][] arr,int r,int c){
        //Straight upward
        for (int i = 0; i < r; i++) {
            if (arr[i][c]){
                return false;
            }
        }
        //left diagonal
        for (int i = 1; i <= Math.min(r,c); i++) {
            if(arr[r-i][c-i]){
                return false;
            }
        }
        //right diagonal
        int right = Math.min(r,arr[r].length-c-1);
        for (int i = 1; i <= right; i++) {
            if (arr[r-i][c+i]){
                return false;
            }

        }
        return true;

    }

    public static void display(boolean[][] arr){



        for (int i = 0; i < arr.length; i++) {
            for (int j =0;j<arr[i].length;j++){
                if(arr[i][j]){

                    System.out.print("Q"+" ");
                }
                else{

                    System.out.print("X"+" ");
                }
            }
            System.out.println();

        }
        System.out.println();


    }

}
