package Array;

import java.util.ArrayList;
//Not satisfy the GFG question
public class SubArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int S = 15;
        System.out.println(getSubArray(arr,S));
    }
    public static ArrayList<Integer> getSubArray(int[] arr, int target){
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0;
        int j = 0;
        int sum = arr[0];
        while(i<=j){
            if(sum<target){
                j++;
                sum = sum+arr[j];
            }
            else if(sum>target){
                sum = sum - arr[i];
                i++;
            }
            else{
                list.add(i+1);
                list.add(j+1);
                break;
            }
        }
        if(list.isEmpty()){
            list.add(-1);
        }
        return list;
    }
}
