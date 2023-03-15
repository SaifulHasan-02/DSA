package SlidingWindow;

public class MaximumSumSubarray {
    public static void main(String[] args) {
        int[] arr = {2,5,1,8,2,9,1};
        int k = 3;
        System.out.println(getMaxSum(arr,k));
    }
    public static int getMaxSum(int[] arr,int k){
        int i =0;
        int j = 1;

        int max = 0;
        while(j < arr.length){
            if(j-i+1 < k){
                j++;
            }else if(j-i+1 == k){


                int sum = 0;
                for (int s = i; s <= j; s++) {
                    sum = sum+arr[s];
                }
                if(sum > max){
                    max = sum;
                }
                i++;
                j++;
            }
        }
        return max;
    }
}
