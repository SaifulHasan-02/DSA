package Array;

public class SubArrayOfGreatestSum {
    public static void main(String[] args) {
        int[] arr = {1,-2,2};
        int ans = getMaxSum(arr);
        System.out.println(ans);
    }
    public static int getMaxSum(int[] arr){
        int maxSum = 0;
        int currSum = 0;
        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];
            if(currSum > maxSum){
                maxSum = currSum;
            }
            else if(currSum < 0) {
                currSum = 0;
            }

        }
        return maxSum;
    }
}
