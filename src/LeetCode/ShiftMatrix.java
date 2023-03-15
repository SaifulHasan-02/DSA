package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class ShiftMatrix {
    public static void main(String[] args) {
        int[][] grid = {{3,8,1,9},{19,7,2,5},{4,6,11,10},{12,0,21,13}};
        int k = 4;
        System.out.println(shiftGrid(grid,k));
    }
    public static List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<List<Integer>> majorList = new ArrayList<List<Integer>>();
        for (int t = 0; t < k; t++) {

            for (int i = 0; i < grid.length; i++) {
                reverse(grid, i, 0, grid[i].length - 1);
            }
            for (int i = 0; i < grid.length; i++) {
                reverse(grid, i, 1, grid[i].length - 1);
            }
            reverseRow(grid, 0, grid.length - 1, 0);
            reverseRow(grid, 1, grid.length - 1, 0);
        }
        for (int i = 0; i < grid.length; i++) {
            List<Integer> minorList = new ArrayList<>();

            for (int j = 0; j < grid[i].length; j++) {
                minorList.add(grid[i][j]);
            }
            majorList.add(minorList);
        }
        return majorList;
    }
    public static void reverse(int[][] grid,int row,int start,int end){
        while (start < end){
            int temp = grid[row][start];
            grid[row][start] = grid[row][end];
            grid[row][end] = temp;
            start++;
            end--;
        }
    }
    public static void reverseRow(int[][] grid,int start,int end,int col){
        while (start <end) {
            int temp = grid[start][col];
            grid[start][col] = grid[end][col];
            grid[end][col] = temp;
            start++;
            end--;
        }
    }
}
