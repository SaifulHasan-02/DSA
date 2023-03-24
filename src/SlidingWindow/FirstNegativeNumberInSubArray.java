package SlidingWindow;

import java.util.ArrayList;

public class FirstNegativeNumberInSubArray {
    public static void main(String[] args) {
        int[] arr = {12,-1,-7,8,-15,30,16,28};
        int k = 3;
        System.out.println(firstNegative(arr,k));

    }
    public static ArrayList<Integer> firstNegative(int[] arr,int k){
        ArrayList<Integer> ans = new ArrayList<>();
        int i =0;
        int j = 1;
        while (j<arr.length){
            if(j-i+1 < k){
                j++;
            }
            else if(j-i+1 == k){

                int e = j;
                int s = i;
                int flag = 0;
                for ( s = i; s <= e ; s++) {
                    if(arr[s] < 0){
                        flag = 1;
                        ans.add(arr[s]);
                        break;
                    }
                }
                if(flag == 0){
                    ans.add(0);
                }
                i++;
                j++;


            }

        }
        return ans;
    }
}
