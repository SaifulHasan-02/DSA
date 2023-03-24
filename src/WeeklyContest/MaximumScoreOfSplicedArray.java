package WeeklyContest;

public class MaximumScoreOfSplicedArray {
    public static void main(String[] args) {
        int[] nums1 = {20,40,20,70,30};
        int[] nums2 = {50,20,50,40,20};
        System.out.println(maximumsSplicedArray(nums1,nums2));
    }
    public static int maximumsSplicedArray(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int max = 0;
        for(int left = 0;left < n;left++){
            for(int right = left;right<n;right++){
                swap(nums1,nums2,right);
                int curMax = getMax(nums1,nums2);
                if(curMax > max){
                    max = curMax;
                }
            }
        }
        return max;

    }
    public static int getMax(int[] nums1,int[] nums2){
        int sum1 = 0,sum2 = 0;
        for(int i =0;i<nums1.length;i++){
            sum1 = sum1+nums1[i];
        }
        for(int i =0;i<nums2.length;i++){
            sum2 = sum2+nums2[i];
        }
        return (int)Math.max(sum1,sum2);

    }
    public static void swap(int[] nums1,int[] nums2,int l){

        int temp = nums1[l];
        nums1[l] = nums2[l];
        nums2[l] = temp;



    }
}
