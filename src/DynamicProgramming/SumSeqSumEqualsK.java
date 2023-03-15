package DynamicProgramming;
//isse jaida shi hai SubSetSumEqualsK
import java.util.Arrays;

public class SumSeqSumEqualsK {
    public static void main(String[] args) {
        int[] arr = {4,3,2,1};
        int k = 5;
        System.out.println(sumseqEqualsK(arr.length-1,arr,k));
        int[][] dp = new int[arr.length][k+1];
        for (int[] row:dp) {
            Arrays.fill(row,-1);
        }
        System.out.println(sumseqEqualsKMemo(arr.length-1,arr,k,dp));
    }
    public static boolean sumseqEqualsK(int ind,int[] arr,int target){
        //if(arr[ind] == target) return  true;
        if(target == 0) return true;
        if(ind == 0) return arr[0] == target;

        boolean nottake = sumseqEqualsK(ind-1,arr,target);
        boolean take = false;
        if(target>=arr[ind]) {
            take = sumseqEqualsK(ind - 1, arr, target - arr[ind]);
        }

        return nottake || take;
    }

    public static boolean sumseqEqualsKMemo(int ind,int[] arr,int target,int[][] dp){
        //if(arr[ind] == target) return  true;
        if(target == 0) return true;
        if(ind == 0) return arr[0] == target;

        if(dp[ind][target] != -1){
            return dp[ind][target] == 0?false:true;
        }

        boolean nottake = sumseqEqualsKMemo(ind-1,arr,target,dp);
        boolean take = false;
        if(target>=arr[ind]) {
            take = sumseqEqualsKMemo(ind - 1, arr, target - arr[ind],dp);

            dp[ind][target] = take || nottake ?1:0;
        }

        return nottake || take;
    }
}
