package DynamicProgramming;
//https://leetcode.com/problems/interleaving-string/
public class InterleavingString {
    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "bc";
        String s3 = "babc";
        System.out.println(isInterleave(s1,s2,s3));
    }
    public static boolean isInterleave(String s1, String s2, String s3) {
        int n1 = s1.length();
        int n2 = s2.length();
        int n3 = s3.length();
        if(n1 ==0) return s3.equals(s2);
        if(n2==0) return s3.equals(s1);

        if(n1+n2 != n3)
            return false;
        boolean[][] dp = new boolean[n1+1][n2+1];
        for (int i = 0; i <= n1; i++) {
            for (int j = 0; j <= n2; j++) {
                if(i == 0 && j== 0) dp[i][j] = true;

                else if(i== 0){
                    if(s2.charAt(j-1)==s3.charAt(i+j-1) && dp[0][j-1])  dp[i][j] = true;
                }
                else if(j == 0){
                    if(s1.charAt(i-1) == s3.charAt(i+j-1) && dp[i-1][0]) dp[i][j] = true;
                }
                else{
                    if(s1.charAt(i-1)==s3.charAt(i+j-1) && dp[i-1][j] ){
                        dp[i][j] = true;
                    }
                    if(s2.charAt(j-1) == s3.charAt(i+j-1) && dp[i][j-1])
                        dp[i][j] =true ;
                }
            }
        }
        return dp[n1][n2];
    }
}
