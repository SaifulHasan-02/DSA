package LeetCode;

import java.util.Arrays;

public class LargestNumber {
    public static void main(String[] args) {
        int num = 65875;
        System.out.println(largestInteger(num));
    }
    public static int largestInteger(int num) {
        int n = num;
        int count = (int)Math.log(n)/(int)Math.log(10);
        System.out.println(count);
        int[] arr = new int[count];
        int i = count-1;
        while(num != 0) {
            arr[i] = num % 10;
            i--;
            num = num / 10;
        }
        int start = 0;
        int end = arr.length-1;
        while(start < end){
            if(arr[start]  % 2 == 0){   //even
                if(arr[end] % 2 == 0){
                    if(arr[start]< arr[end]){
                        swap(arr,start,end);
                        start++;
                        end= arr.length-1;
                    }
                }else{
                    end--;
                }

            }
            else{   //odd
                if(arr[end] % 2 != 0){
                    if(arr[start]<arr[end]){
                        swap(arr,start,end);
                        start++;
                        end=arr.length-1;
                    }
                }else{
                    end--;
                }

            }

        }

        System.out.println(Arrays.toString(arr));
        return 0;
    }
    public static void swap(int[] arr,int l,int r){
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }
}
