package DynamicProgramming;
//ye glt tarika hai plz try with stack
public class LongestValidParentheses {
    public static void main(String[] args) {
        String s = ")()())";
        System.out.println(longestValidParentheses(s));
    }
    public static int longestValidParentheses(String s) {
        int n = s.length();
        boolean[][] dp = new boolean[n][n];
        int len = 0;
        for(int g =0;g<n;g++){

            for(int i =0,j=g;j<n;i++,j++){
                if(g == 0){
                    dp[i][j] = false;
                }
                else if(g == 1){
                    if((s.charAt(i)=='(' && s.charAt(j)==')')||(s.charAt(i)==')' && s.charAt(j)=='(')){
                        dp[i][j] = true;
                    }
                }
                else{
                    if((s.charAt(i)=='(' && s.charAt(j)==')'&&dp[i+1][j-1])){
                        dp[i][j] = true;
                    }
                }
                if(dp[i][j]){
                    len = g+1;
                }
            }

        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
        return len;
    }
}
