package SortingAlorithms;

import java.util.Arrays;
//glt hai,,shi krna hai
public class SelectionSortAlgoAsc {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void selectionSort(int[]arr){
        for (int i = 0; i < arr.length ; i++) {
            int minInd = getMin(arr,i,arr.length-1);
            swap(arr,i,minInd);
        }
    }
    public static int getMin(int[] arr,int s,int e){
        int min = arr[s];
        int minInd = 0;
        for (int i = s; i <= e; i++) {
            if(arr[i]<min){
                minInd = i;
            }
        }
        return minInd;
    }
    public static void swap(int[] arr,int l,int r){
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }
}
