package SlidingWindow;

import java.util.Arrays;

public class MaxOfAllSubArray {
    public static void main(String[] args) {
        int[] arr = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        System.out.println(Arrays.toString(getMaxArray(arr,k)));
    }
    public static int[] getMaxArray(int[] arr,int k){
        int n = arr.length;
        int[] ans = new int[n-2];
        int i = 0;
        int j = 1;
        int ind = 0;
        while (j<n){
            if(j-i+1 < k){
                j++;
            }
            else if(j-i+1 == k){
                int max = 0;
                for (int s = i; s <= j; s++) {
                    if(arr[s]> max){
                        max = arr[s];
                    }
                }
                ans[ind] = max;
                ind++;
                i++;
                j++;

            }
        }
        return ans;
    }
}
