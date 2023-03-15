package SortingAlorithms;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int [] arr = {35,40,38,32,30};
//        bubbleSort(arr);
        bubbleSort2(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void bubbleSort2(int[] arr){
        int count = 0;
        int n = arr.length;

        for (int i = 0; i < n-1; i++) {
            boolean flag = false;
            for (int j = 0; j < n-1-i; j++) {
                if(arr[j] > arr[j+1]){
                    swap(arr,j,j+1);
                    count++;
                    flag = true;
                }
            }
            if(!flag) break;
        }
        System.out.println(count);
    }
    public static void bubbleSort(int[] arr){

        for (int i = 0; i < arr.length-1; i++) {
            int flag = 0;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                    flag = 1;
                }
            }
            if (flag == 0)
                break;
        }
    }
    public static void swap(int[]  arr,int start,int end) {

        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}

