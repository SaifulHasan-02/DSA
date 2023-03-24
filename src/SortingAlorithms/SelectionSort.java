package SortingAlorithms;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int [] arr = {5,4,3,2,1};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void selectionSort(int[] arr){

        for (int i = 0; i < arr.length; i++) {
            int lastInd = arr.length-1-i;
            int maxInd = getMaxInd(arr,lastInd);
            swap(arr,maxInd,lastInd);
        }
    }
    public static int getMaxInd(int[] arr,int lastInd){
        int max = arr[0];
        int maxInd = 0;
        for (int i = 0; i <= lastInd; i++) {
            if(arr[i]>max){
                max = arr[i];
                maxInd = i;
            }
        }
        return maxInd;
    }
    public static void swap(int[]  arr,int start,int end) {

        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
