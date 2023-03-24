package BinarySeach;

import java.util.Arrays;

public class BSinMatrix {
    public static void main(String[] args) {
       int[][] matrix = {{-1,3}};

        int target = -1;
        //System.out.println(Arrays.toString(search(matrix,target)));
        System.out.println(Arrays.toString(binarySearch(matrix,target)));
    }
    public static int[] binarySearch(int[][] mat,int target){
        int row = mat.length;
        System.out.println(row);
        int col = mat[0].length;
        System.out.println(col);
        if(row == 1){
            return bSearch(mat,0,0,col-1,target);
        }
        int rowStart = 0;
        int rowEnd = row-1;


        int cMid = col/2;

        while(rowStart < (rowEnd-1)){
           int rMid = rowStart + (rowEnd - rowStart)/2;
           if(mat[rMid][cMid]==target){     //you find the target
               return new int[]{rMid,cMid};
           }else if(mat[rMid][cMid]>target){ //ignoring the below rows
               rowEnd = rMid;
           }else{                           //ignoring the above rows
               rowStart = rMid;
           }
       }
       //there are 4 cases for searching element in Matrix;
        if(mat[rowStart][cMid]==target){
            return new int[]{rowStart,cMid};
        }
        if(mat[rowEnd][cMid]==target){
            return new int[]{rowEnd,cMid};
        }
        if(mat[rowStart][cMid-1] >= target){
            return bSearch(mat,rowStart,0,cMid-1,target);
        }
        if(mat[rowStart][cMid+1] <= target && target <= mat[rowStart][col-1]){
             return bSearch(mat,rowStart,cMid+1,col-1,target);
        }
        if(mat[rowEnd][cMid-1] >= target ){
            return bSearch(mat,rowEnd,0,cMid-1,target);
        }
        else {
            return bSearch(mat, rowEnd, cMid + 1, col - 1, target);
        }
    }
    public static int[] bSearch(int[][] mat,int row ,int s,int e,int target){

        while(s<=e){
            int m = s+(e-s)/2;
            if(mat[row][e]==target){
                return new int[]{row,m};
            }
            else if(mat[row][e]>target){
                e = m-1;
            }else{
                s = m+1;
            }
        }
        return new int[]{-1,-1};

    }
    public static int[] search(int[][] mat, int target){
        int[] ans = {-1,-1};
        int row = 0;
        int col = mat[0].length-1;
        while(row<mat.length && col>=0){
            if(mat[row][col] == target){
                return new int[]{row,col};
            }else if(mat[row][col]>target){
                col--;
            }else{
                row++;
            }
        }
        return ans;
    }

}
