package Array;


//https://leetcode.com/problems/trapping-rain-water/

public class TrappingRainWater {
    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
//        System.out.println(trap(height));
        System.out.println(trapTwoPointer(height));
    }
    public static int trapTwoPointer(int[] arr){
        int l = 0;
        int r = arr.length-1;
        int leftMax = 0;
        int rightMax = 0;
        int ans = 0;

        while (l <= r) {
            if(arr[l] <= arr[r]){
                if(arr[l] >= leftMax) {
                    leftMax = arr[l];
                }
                else{
                    ans += (leftMax - arr[l]);
                }
                l++;
            }
            else {
                if(arr[r] >= rightMax){
                    rightMax = arr[r];
                }
                else{
                    ans += (rightMax - arr[r]);
                }
                r--;
            }
        }
        return  ans;
    }

    public static int trap(int[] height) {
        int n = height.length;
        int sum = 0;
        for (int i = 1; i < n; i++) {
            int j = i - 1;
            int k = i + 1;
            while (j>0 && height[j] < height[j - 1]){
                j--;
            }
            while (k > i && k < n-2 && height[k] < height[k+1]){
                k++;
            }
            int h = Math.min(height[j],height[k]);
            sum = sum + (h - height[i]);
        }
        return sum;
    }
}
