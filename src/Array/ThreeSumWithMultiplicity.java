package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSumWithMultiplicity {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,3,4,4,5,5};
        int target = 8;
        System.out.println(getSum(arr,target));
    }
    public static List<List<Integer>> getSum(int[] arr, int target){
        Arrays.sort(arr);
        List<List<Integer>> majorList = new ArrayList<List<Integer>>();
        int i =0;
        int j = i+1;
        int k = arr.length-1;
        while(j<k){
            if(arr[i]+arr[j]+arr[k] == target && i != j ){
                List<Integer> minorList = new ArrayList<>();
                minorList.add(arr[i]);
                minorList.add(arr[j]);
                minorList.add(arr[k]);
                majorList.add(minorList);
                k--;
            }
            if(arr[i]+arr[j]+arr[k]>target){
                k--;
            }else{
                i++;
            }
        }
        return majorList;
    }
}
