package SortingAlorithms;

import java.util.Arrays;

public class CountingSort {//when range of values of array is given then use counting Sort
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1,1,2,4,6,0,10};
        int n = arr.length;
        countingSort(arr,n);
        System.out.println(Arrays.toString(arr));
    }
    public static void countingSort(int[] arr,int n){
        int[] count = new int[100];

        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
        }
        int ind = 0;
        for (int i = 0; i < 100; i++) {
            while (count[i]>0){
                arr[ind++] = i;
                count[i]--;
            }
        }

    }
}
