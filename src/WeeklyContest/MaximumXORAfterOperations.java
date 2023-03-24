package WeeklyContest;

public class MaximumXORAfterOperations {
    public static void main(String[] args) {
        int[] nums = {3,2,4,6};
        System.out.println(maximumXOR(nums));
    }
    public static int maximumXOR(int[] nums) {
        int max = 0;
        int z = 0;
        int ind = 0;
        for (int i = 0; i < 10; i++) {
            //int cur = 0;
            for (int j = 0; j < nums.length; j++) {
                nums[j] = nums[j] &(nums[j] ^ i);
                if(max < nums[j]){
                    max = nums[j];
                    nums[j] = max;
                    ind = j;
                }
            }
        }
        int ans = 0;

        for (int i = 0; i < nums.length; i++) {
            if(i != ind){
                ans  = nums[i] ^ nums[ind];
            }
        }
        return ans;
    }
}
