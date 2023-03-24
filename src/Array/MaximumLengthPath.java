package Array;

public class MaximumLengthPath {
    public static void main(String[] args) {
        int[][] mat = {{9,1,3},{7,4,2},{6,5,0}};
        int n = mat.length;
        int count = 0;
        System.out.println(maximunLengthPath(mat,n-1,n-1,count));

    }
    public static int maximunLengthPath(int[][] mat,int row,int col,int count){
        if(row == 0 && col == 0){
            return 1;
        }

        if(row > 0){
            if(mat[row][col] - mat[row-1][col] == -1){

                count = 1+maximunLengthPath(mat,row-1,col,count);
            }
            else{
                count = maximunLengthPath(mat,row-1,col,count);
            }
        }
        if(row >0 && col > 0){
            if(mat[row][col] - mat[row-1][col] == -1){
//                count++;
                count = 1+maximunLengthPath(mat,row-1,col-1,count);
            }
            else{
                count = maximunLengthPath(mat,row-1,col-1,count);
            }

        }
        if(col>0){
            if(mat[row][col] - mat[row][col-1] == -1){
//                count++;
                count = 1 +maximunLengthPath(mat,row,col-1,count+1);
            }
            else {
                count = maximunLengthPath(mat,row,col-1,count);
            }
        }
        return count;

    }
}
