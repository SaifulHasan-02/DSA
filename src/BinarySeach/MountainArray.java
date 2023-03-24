package BinarySeach;

public class MountainArray {
    public static void main(String[] args) {
        int[] arr ={1,2,3,5,7,6,3,2};
        System.out.println(getMountain(arr));
    }

    private static int getMountain(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while (start < end){
            int mid = start + (end - start) / 2;

            if(arr[mid] >= arr[start]){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return start;
    }

}
