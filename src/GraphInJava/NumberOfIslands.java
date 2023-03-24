package GraphInJava;

import java.util.LinkedList;
import java.util.Queue;

public class NumberOfIslands {
    public static void main(String[] args) {
        char[][] grid = {{'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}
        };
        System.out.println(numOfIslands(grid));     //bfs
        System.out.println(numIslands(grid));   //dfs
    }

    public static int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        boolean[][] visited = new boolean[n][m];
        int count = 0;


        for(int i =0;i<n;i++){
            for(int j =0;j<m;j++){
                if(grid[i][j] == '1' && !visited[i][j]){
                    dfs(grid,i,j,visited);
                    count++;
                }
            }
        }
        return count;

    }
    public static void dfs(char[][]grid,int i,int j,boolean[][] visited){

        if(i<0 || j<0 || i>=grid.length || j>= grid[0].length || visited[i][j] || grid[i][j] == '0')
            return;

        visited[i][j] = true;
        dfs(grid,i-1,j,visited);
        dfs(grid,i,j-1,visited);
        dfs(grid,i+1,j,visited);
        dfs(grid,i,j+1,visited);
    }

    public static int numOfIslands(char[][] grid){
        int n = grid.length ,m = grid[0].length;

        boolean[][] visited = new boolean[n][m];
        Queue<int[]> q = new LinkedList<>();

        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                if(grid[i][j] == '1' && !visited[i][j] ){
                    q.offer(new int[]{i,j});
                    count++;
                    bfs(i,j,grid,visited,q);
                }
            }
        }
        return count;
    }
    public static void bfs(int row,int col,char[][]grid,boolean[][]visited,Queue<int[]> q){


        int n = grid.length,m = grid[0].length;
        while (!q.isEmpty()){
            int[] arr = q.poll();
            row = arr[0];
            col = arr[1];



            for (int deltaRow = -1; deltaRow <=1 ; deltaRow++) {
                for (int deltaCol = -1; deltaCol <= 1 ; deltaCol++) {
                    int newRow = row +deltaRow;
                    int newCol = col + deltaCol;
                    if(newRow>=0 && newRow<n && newCol>=0 && newCol <m
                            && !visited[newRow][newCol] &&  grid[newRow][newCol] == '1'){
                        visited[newRow][newCol] = true;
                        q.offer(new int[]{newRow,newRow});
                    }
                }
            }
        }
    }
}
