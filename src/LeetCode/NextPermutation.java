package LeetCode;

import java.util.Arrays;

public class NextPermutation {
    public static void main(String[] args) {
        int[] arr = {1,2,3};

        System.out.println(Arrays.toString(nextPermutation(arr)));
    }

    private static int[] nextPermutation(int[] arr) {
        int i = arr.length-2;
        while(i>=0 && arr[i] >= arr[i+1]){
            i--;
        }
        //best condition
        if(i >= 0){
            int j = arr.length-1;
            while(arr[j] <= arr[i]){
                j--;
            }
            swap(arr,i,j);
        }
        //worst condition
        reverse(arr,i+1,arr.length-1);

        return arr;
    }
    public static void swap(int[] arr,int l,int r){
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;

    }
    public static void reverse(int[] arr,int start,int end){
        while(start < end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }
    /*
    public static int getAscendingDisturb(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start < end){
            swap(arr,start,end);
            start++;
            end--;
        }
        int s = 0;
        int e = arr.length-1;
        while(s < e){
            int m = s+(e-s)/2;
            if(m<e && arr[m]>arr[m+1]){
                return m;
            }
            if(m > s && arr[m]<arr[m-1]){
                return m-1;
            }
            if(arr[s]>= arr[m]){
                e = m-1;
            }
            else{
                s = m+1;
            }
        }
        return -1;

    }

     */

}
