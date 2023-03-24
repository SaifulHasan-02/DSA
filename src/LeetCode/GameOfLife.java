package LeetCode;

public class GameOfLife {
    public static void main(String[] args) {
        int[][] matrix = {{0,1,0},{0,0,1},{1,1,1},{0,0,0}};
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
        System.out.println();
        gameOfLife(matrix);
    }
    public static void gameOfLife(int[][] board) {
        if (board == null || board.length == 0) {
            return;
        }
        int m = board.length;
        int n = board[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int count = getNeighbors(board, i, j, m , n);
                if (count == 3 || board[i][j] + count == 3) {
                    board[i][j] ^= 2;
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = board[i][j] >> 1;
            }
        }
    }

    private static int  getNeighbors(int[][] board, int i, int j, int m, int n) {
        int result = 0;
        for (int x = Math.max(i-1, 0); x < Math.min(i+2, m); x++) {
            for (int y = Math.max(j-1, 0); y < Math.min(j+2, n); y++) {
                result += (board[x][y] & 1);
            }
        }
        return result - (board[i][j] & 1);
    }
    /*


    public static void gameOfLife(int[][]board){
        int rT = board.length;
        int cT = board[0].length;
        int[][] ans = new int[rT][cT];
        for (int row = 0; row <board.length ; row++) {

            for (int col = 0; col < board[row].length; col++) {
                int countAlive = 0;
                if(board[row][col]==1){
                    countAlive = getAlive(board,row,col);
                    if(countAlive < 2){
                        ans[row][col] = 0;
                    }
                    else if(countAlive == 2 || countAlive == 3 ){
                        ans[row][col] = 1;
                    }
                    else {
                        ans[row][col] = 0;
                    }

                }
                else{
                    countAlive = getAlive(board,row,col);
                    if(countAlive == 3){
                        ans[row][col] = 1;
                    }else{
                        ans[row][col] = 0;
                    }

                }

            }

        }
        for (int[] an : ans) {
            for (int i : an) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
    public static int getAlive(int[][]board ,int r,int c){
        int countOne = 0;
        //check for left straight
        if(c>0 && board[r][c-1] == 1){
            countOne++;
        }
        //check for right straight
        if(c<board[r].length-2 && board[r][c+1] == 1){
            countOne++;
        }


        //check for upper straight path

        if(r> 0 && board[r-1][c] == 1) {
            countOne++;
        }
        //check for down straight
        if(r<board.length-2 && board[r+1][c] == 1){
            countOne++;
        }

        //check for left upper diagonal
        if(r>1 && c>1 && board[r-1][c-1] == 1){
            countOne++;
        }
        //check for right upper diagonal
        if(r>1 && c< board.length-2 && board[r-1][c+1] == 1){
            countOne++;
        }

        //check for left down diagonal
        if(r<board.length-2 && c>0 && board[r+1][c-1] == 1){
            countOne++;
        }
        //check for right down diagonal
        if(r<board.length-2 && c< board[r].length-2  && board[r+1][c+1] == 1){
            countOne++;
        }
        return countOne;
    }

     */
}

