package SlidingWindow;

import java.util.ArrayList;

public class SumOfAllOddLengthSubarrays {
    public static void main(String[] args) {
        int[] arr = {1,4,2,5,3};
        System.out.println(sumOddLengthSubarrays(arr));
    }
    //glt hai
    public static int sumOddLengthSubarrays(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
         int sum = 0;
        int i =0;
        while(i<arr.length){
            int k =i;
            list.add(arr[k]);
            for (int j = i+k; j < arr.length; j++) {
                list.add(arr[j]+list.get(k));
                k++;
                if(k % 2 != 0){
                    sum = sum + list.get(k);
                }
            }
            i++;
        }

        return sum;
    }
}
