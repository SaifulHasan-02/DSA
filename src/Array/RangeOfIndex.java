package Array;

import java.util.Arrays;

public class RangeOfIndex {
    public static void main(String[] args) {
        long[] arr =  { 1, 3, 5, 5, 5, 5, 67, 123, 125 };
        int target = 5;
        int[] num = {-1,-1};
        num[0] = searchLeft(arr,0,arr.length-1,target);
        num[1] = searchRight(arr,0,arr.length-1,target);
        System.out.println(Arrays.toString(num));
        //Another way
        int[] res = {-1,-1};
        res[0] = search(arr,0,arr.length-1,target,true);
        res[1] = search(arr,0,arr.length-1,target,false);
        System.out.println(Arrays.toString(res));
    }
    public static int searchLeft(long[] arr,int s,int e,int target){
        int ans = -1;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(arr[mid]>target){
                e = mid -1;
            }
            else if(arr[mid] < target){
                s = mid + 1;
            }
            else{
                ans = mid;
                e = mid - 1;
            }
        }
        return ans;
    }
    public static int searchRight(long[] arr,int s,int e,int target){
        int ans = -1;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(arr[mid]>target){
                e = mid -1;
            }
            else if(arr[mid] < target){
                s = mid + 1;
            }
            else{
                ans = mid;
                s = mid + 1;
            }
        }
        return ans;
    }
    public static int search(long[] arr,int s,int e,int target,boolean leftRight){
        int ans = -1;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(arr[mid]>target){
                e = mid -1;
            }
            else if(arr[mid] < target){
                s = mid + 1;
            }
            else{
                ans = mid;
                if(leftRight){
                    e = mid - 1;
                }
                else{
                    s = mid + 1;
                }
            }
        }
        return ans;
    }
}
