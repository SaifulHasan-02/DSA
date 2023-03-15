package SortingAlorithms;

import java.util.Arrays;

public class QuickSortAlgo {
    public static void main(String[] args) {
        int[] arr = {44,33,11,55,77,99,40,60,99,22,88,66,66};
//        quickSort(arr,0,arr.length-1,0);
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void quickSort(int[]arr,int lb,int ub){
        if(lb>ub)return;

        int start = lb;
        int end = ub;
        int mid = start+(end-start)/2;
        int pivot = arr[mid];

        if (start<= end){
            while (arr[start] <pivot){
                start++;
            }
            while (arr[end]>pivot){
                end--;
            }
            if(start<=end){
                swap(arr,start,end);
                start++;
                end--;
            }

        }
        quickSort(arr,lb,end);
        quickSort(arr,start,ub);
    }
    /*
    public static void quickSort(int[] arr,int  lb,int ub,int count){
        if(lb>ub){
            return;
        }

        int start = lb;
        int end = ub;
        int mid = start+(end-start)/2;
        int pivot = arr[mid];

        if(start<=end){
            while (arr[start]<pivot){
                start++;
            }
            while (arr[end]> pivot){
                end--;
            }


                if (start <= end) {
                    swap(arr, start, end);
                    start++;
                    end--;
                    count++;
                    if(count == 4)
                        System.out.println(Arrays.toString(arr));
                }

        }
        quickSort(arr,lb,end,count);
        quickSort(arr,start,ub,count);
    }

     */
    public static void swap(int[] arr,int start,int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
