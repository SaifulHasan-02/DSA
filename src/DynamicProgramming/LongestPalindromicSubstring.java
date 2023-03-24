package DynamicProgramming;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        String s = "babad";
        System.out.println(longestPalinSubstring(s));
    }
    public static String longestPalinSubstring(String s){
        int n = s.length();
        boolean[][] dp = new boolean[n][n];
        int len = 0;
        int start = 0;
        int end = 0;
        for (int g = 0; g < n; g++) {
            for (int i = 0,j = g; j<n  ; i++,j++) {
                if(g == 0){
                    dp[i][j] = true;
                }else if(g == 1){
                    if(s.charAt(i)==s.charAt(j)){
                        dp[i][j] = true;
                    }
                }
                else{
                    if((s.charAt(i)==s.charAt(j)) && dp[i+1][j-1]){
                        dp[i][j] = true;
                    }
                }
                if(dp[i][j]){
                    start = i;
                    end = j;
                    len = g+1;  //len = j-i+1;
                }
            }
        }
        System.out.println(len);
        return s.substring(start,end+1);
    }
}
