package Array;

import java.util.Arrays;
import java.util.HashSet;

public class ArrayMissing {
    public static  void main(String[] args) {
        int[] arr = {0,1,8,7,6,5,2,4,9,3,11,10,13};
        System.out.println(getMissing(arr));
        System.out.println(getMissUsingHashSet(arr));
        System.out.println(getMissBest(arr));
//        System.out.println(getMissUsingXor(arr));
        System.out.println(getMiss(arr));
    }
    public static int getMiss(int[]arr){
        int sum = 0,n = arr.length;

        sum = n *(n+1)/2;
        int sumOfArray = 0;
        for (int e:arr) {
            sumOfArray += e;
        }
        return sum-sumOfArray;
    }

    private static int getMissUsingXor(int[] arr) {
        int unique = 0;
        for (int i = 0; i < arr.length; i++) {
            unique ^=arr[i];
        }

        return unique;
    }

    private static int getMissBest(int[] arr) {
        int j =0;
        int i = arr.length-1;
        while(i >= 0){
            if(j == arr[i]){
                j++;
                i=arr.length-1;
            }else{
                i--;
            }
        }
        return j;
    }

    public static int getMissing(int[] arr){
        int i = 0;
        Arrays.sort(arr);
        for (i = 0; i < arr.length; i++) {
            if(i != arr[i]){
                break;
            }
        }
        if(i> -1 && i <= arr.length-1){
            return i;
        }
        return i;
    }
    public static int getMissUsingHashSet(int[] arr){
        HashSet<Integer>set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        int i = 0;
        for (int e:set) {
            if(i != e){
                break;
            }
            else{
                i++;
            }
        }
        return i;
    }
}
