package DynamicProgramming;
//ye jaida shi hai
public class SubSetSumEqualsK {
    public static void main(String[] args) {
        int[] nums = {1,2,2,3};
        int k = 4;
        System.out.println(isSumK(nums,k));
    }
    public static boolean isSumK(int[] nums,int k){
        int n = nums.length;
        boolean[][] dp = new boolean[n+1][k+1];

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= k ; j++) {
                if(i == 0 && j == 0) dp[i][j] = true;

                else if(i == 0 && j != 0) dp[i][j] = false;

                else if(j == 0) dp[i][j] = true;

                else{
                    if(dp[i-1][j]) dp[i][j] = true;
                    int sc = nums[i-1];
                    if(j >= sc){
                        if(dp[i-1][j-sc]) dp[i][j] = true;
                    }
                }
            }
        }
        //retrun dp[n][k]; //ya phir niche wala code
        for (int i = 0; i <= n; i++) {
            if(dp[i][k]){
                return true;
            }
        }
        return false;
    }
}
