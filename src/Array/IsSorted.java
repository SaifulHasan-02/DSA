package Array;

public class IsSorted {
    public static void main(String[] args) {
        int[]arr = {1,2,3,4,12,14,100};
        System.out.println(isSorted(arr,0));
    }
    public static boolean isSorted(int[] arr,int ind){
        if(ind == arr.length-1){
            return true;
        }
        return (arr[ind] < arr[ind+1]) && isSorted(arr,ind+1);
    }
}
