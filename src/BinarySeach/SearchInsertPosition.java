package BinarySeach;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 7;

        System.out.println(searchInsert(nums,target));
    }
    public static int searchInsert(int[] nums, int target) {
        int s = 0,e = nums.length-1;

        while(s<=e){
            int m = s+(e-s)/2;

            if(nums[m] == target){
                return m;
            }
            else if(nums[m] < target){
                s = m + 1;
            }

            else {
                e = m - 1;
            }
        }
        return e+1;
    }
}
