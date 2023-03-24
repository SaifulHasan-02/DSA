package Array;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {4,2,3};
        System.out.println(checkSort(arr));
    }
    public static boolean checkSort(int[] arr){
        int i =0;
        int count = 0;
        while (i<arr.length-1){
            if(arr[i]<=arr[i+1]){
                i++;
            }else{
                count++;
                i++;
            }
        }
        if(count>1)
            return false;
        return true;
    }
}
