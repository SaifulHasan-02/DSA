package BinarySeach;

public class OgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr = {11,9,7,5,3,2,1};
        int target = 7;
        System.out.println(ognosticBS(arr,target));
    }
    public static int ognosticBS(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;

         boolean isAsc = arr[start] < arr[end];
        while (start<=end){
            int mid = start+(end-start)/2;

            if(arr[mid] == target) return mid;

            else if(isAsc){
                if(arr[mid] < target){
                    start = mid + 1;
                }
                else end = mid - 1;
            }
            else{
                if(arr[mid] > target){
                    start = mid + 1;
                }
                else end = mid - 1;
            }
        }
        return -1;
    }
}
