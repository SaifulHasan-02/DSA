package BinarySeach;

import java.util.Arrays;
import java.util.Collections;

public class RangeArray {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        System.out.println(Arrays.toString(searchRange(nums,target)));

    }
    public static int[] searchRange(int[] nums, int target) {
        int[] arr = new int[2];
//        Collections.sort(nums);
        /*
        int left = search(nums,target,true);
        int right = search(nums,target,false);
        arr[0] = left;
        arr[1] = right;
        return arr;

         */
        int left = searchLeft(nums,target);
        int right = searchRight(nums,target);
        arr[0] = left;
        arr[1] = right;
        return arr;

    }
    public static int search(int[] nums,int target,boolean left){
        int start = 0;
        int end = nums.length-1;
        int ans = -1;
        while(start<=end){
            int mid = start+(end - start)/2;
            if(nums[mid]> target){
                end = mid-1;
            }
            else if(nums[mid] < target){
                start = mid +1;
            }
            else {
                ans = mid;
                if(left){
                    end = mid -1;
                }
                else{
                    start = mid +1;
                }
            }
        }
        return ans;
    }
    public static int searchLeft(int[] nums,int target){
        int start = 0;
        int end = nums.length-1;
        int ans = -1;
        while(start<=end){
            int mid = start+(end - start)/2;
            if(nums[mid]> target){
                end = mid-1;
            }
            else if(nums[mid] < target){
                start = mid +1;
            }
            else {
                ans = mid;
                end = mid -1;
            }
        }
        return ans;
    }
    public static int searchRight(int[] nums,int target){
        int start = 0;
        int end = nums.length-1;
        int ans = -1;
        while(start<=end){
            int mid = start+(end - start)/2;
            if(nums[mid]> target){
                end = mid-1;
            }
            else if(nums[mid] < target){
                start = mid +1;
            }
            else {
                ans = mid;
                start = mid + 1;
            }
        }
        return ans;
    }
}
