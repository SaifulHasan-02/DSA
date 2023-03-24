package GraphInJava;

//https://leetcode.com/problems/flood-fill/

import java.util.Arrays;

public class FloodFill {
    public static void main(String[] args) {
        int[][] image = {{1,1,1},{1,1,0},{1,0,1}};

        System.out.println(Arrays.deepToString(floodFill(image,1,1,2)));
    }

    public static  int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int n = image.length;
        int m = image[0].length;
        for (int i = sr; i < n; i++) {
            for (int j = sc; j < m; j++) {
                if(image[i][j] == image[sr][sc] && image[sr][sc] != color){
//                    dfs(i,j,image,n,m,color,image[sr][sc]);
                    dfs2(i,j,image,n,m,color,image[sr][sc]);

                }
            }
        }
        return image;
    }
    public static void dfs(int row,int col,int[][]image,int n,int m, int color,int oldColor){
        if(row < 0 || col < 0 || row >= n || col >= m){
            return;
        }
        image[row][col] = color;
        if(row>0 && image[row-1][col] == oldColor){
            dfs(row-1,col,image,n,m,color,oldColor);
        }
        if(col> 0 && image[row][col-1]==oldColor){
            dfs(row,col-1,image,n,m,color,oldColor);
        }
        if(row< n-1 && image[row+1][col] == oldColor){
            dfs(row+1,col,image,n,m,color,oldColor);
        }
        if(col < m-1 && image[row][col+1] == oldColor){
            dfs(row,col+1,image,n,m,color,oldColor);
        }

    }
    public static void dfs2(int row,int col,int[][]image,int n,int m, int color,int oldColor){
        if(row < 0 || col < 0 || row >= n || col >= m || image[row][col] != oldColor){
            return;
        }
        image[row][col] = color;

        dfs(row-1,col,image,n,m,color,oldColor);
        dfs(row,col-1,image,n,m,color,oldColor);
        dfs(row+1,col,image,n,m,color,oldColor);
        dfs(row,col+1,image,n,m,color,oldColor);
    }
}
