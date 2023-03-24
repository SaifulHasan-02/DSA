package SortingAlorithms;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {4,3,5,2,1};
        //System.out.println(Arrays.toString(cyclicSort(arr)));
        cyclicSort2(arr);
        System.out.println(Arrays.toString(arr));


    }
    public static void cyclicSort2(int[] arr){
        int i = 0;
        while (i<arr.length){
            if(arr[i] != i+1){
                swap(arr,arr[i]-1,i);
            }else{
                i++;
            }
        }
    }
    public static int[] cyclicSort(int[] arr){
        int i = 0;

        while (i<arr.length){
           if(arr[i] != i+1){
               swap(arr,i,arr[i]-1);
           }else{
               i++;
           }
        }
        return arr;
    }
    public static void swap(int[] arr, int s,int e){
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
    }
}
