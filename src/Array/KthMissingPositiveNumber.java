package Array;
//https://leetcode.com/problems/kth-missing-positive-number/description/

import java.util.List;
import java.util.ArrayList;

public class KthMissingPositiveNumber {
    public static void main(String[] args) {
        int[]arr = {5,6,7,8,9};
        int k = 9;
        System.out.println(findKthPositive(arr, k));
    }
    public static int findKthPositive(int[] arr, int k) {
        List<Integer> list = new ArrayList<>();
        int i = 0, val = 1;
        while(i < arr.length){
            if(arr[i] != val){
                list.add(val);
                val++;
            }else{
                val++;
                i++;
            }
        }
        if(list.size() >= k){
           return list.get(k-1);
        }
        return arr[arr.length - 1] + (k - list.size());


    }
}

