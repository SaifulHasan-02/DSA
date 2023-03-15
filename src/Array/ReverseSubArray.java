package Array;
import java.util.ArrayList;
import java.util.Arrays;
public class ReverseSubArray {
    public static void main(String[] args) {
        //int[] arr = {1,2,3,4,5};
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        int k = 3;
        Object[] nums = arr.toArray();
        reverseArray(nums,0,k-1);
        reverseArray(nums,k,nums.length-1);
        System.out.println(Arrays.toString(nums));
    }

    public static void reverseArray(Object[] arr,int s,int e){
        while(s<e){
            swap(arr,s,e);
            s++;
            e--;
        }
    }
    public static void swap(Object[] arr,int l,int r){
        Object temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }
}
