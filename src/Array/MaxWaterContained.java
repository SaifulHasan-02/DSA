package Array;
//leetcode question
public class MaxWaterContained {
    public static void main(String[] args) {
        int[] arr = {1,8,6,2,5,4,8,3,7};
        System.out.println(getMaxArea(arr));
    }

    private static int getMaxArea(int[] arr) {
        int i = 0;
        int j = arr.length-1;
        int maxArea = -1;
        while(i<j){
            int b = j-i;
            int h = (int)Math.min(arr[i],arr[j]);
            int area = b*h;
            if(area > maxArea){
                maxArea = area;
            }
            if(arr[i]>arr[j]){
                j--;
            }else{
                i++;
            }
        }
        return maxArea;
    }
}
