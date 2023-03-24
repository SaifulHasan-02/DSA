package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSumP {
    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,-4};
        System.out.println(getThreeSum(arr));
    }
    public static List<List<Integer>> getThreeSum(int[] arr){
        List<List<Integer>> outer = new ArrayList<List<Integer>>();

        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 2; i++) {
            if(i>0 && arr[i] == arr[i-1]){
                continue;
            }
            int j = i+1;
            int k = arr.length-1;
            while(j<k){
                if(arr[i]+arr[j]+arr[k]==0){
                    List<Integer> internal = new ArrayList<>();
                    internal.add(arr[i]);
                    internal.add(arr[j]);
                    internal.add(arr[k]);
                    outer.add(internal);
                    k--;

                    while(k>j && arr[k] == arr[k+1]){
                        k--;
                    }
                }
                else if(arr[i]+arr[j]+arr[k]>0){
                    k--;
                }else{
                    j++;
                }
            }
        }
        return outer;
    }
}
