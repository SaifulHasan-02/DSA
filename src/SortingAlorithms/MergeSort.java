package SortingAlorithms;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int [] arr = {5,4,3,2,1};
        mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void mergeSort(int[] arr,int s,int e){
        if(s<e){
            int m = s+(e-s)/2;
            mergeSort(arr,0,m);
            mergeSort(arr,m+1,e);
            merge(arr,s,m,e);
        }
    }
    public static void merge(int[]arr,int s,int m,int e){
        int[] ans = new int[e+1];
        int i=0;
        int j=m+1;
        int k =0;

        while (i<=m && j<=e){
            if(arr[i]<arr[j]){
                ans[k] = arr[i];
                i++;
            }else{
                ans[k] = arr[j];
                j++;
            }
            k++;
        }
        while(i <= m){
            ans[k] = arr[i];
            k++;
            i++;
        }
        while (j<=e){
            ans[k] = arr[j];
            k++;
            j++;
        }
        int z =0;
        for (int ele: ans) {
            arr[z] = ele;
            z++;
        }
    }
}
