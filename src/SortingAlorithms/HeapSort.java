package SortingAlorithms;

import java.util.Arrays;

public class HeapSort {
    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6, 7};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int[] arr){
        int n = arr.length;

        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);


        for (int i= n-1;i>0;i--){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr,i,0);
        }
    }
    public static void heapify(int[] arr,int n,int i){
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if(l<n && arr[l]>arr[largest]){
            int t = arr[l];
            arr[l] = arr[largest];
            arr[largest] = t;
        }
        if(r<n && arr[largest] < arr[r]){
            int t = arr[r];
            arr[r] = arr[largest];
            arr[largest] = t;
        }

        if(largest != i){
            int t = arr[i];
            arr[i] = arr[largest];
            arr[largest] = t;

            heapify(arr,n,largest);
        }
    }
}
