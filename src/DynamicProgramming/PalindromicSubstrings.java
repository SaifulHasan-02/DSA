package DynamicProgramming;
//Find  number of Palindromic substring
public class PalindromicSubstrings {
    public static void main(String[] args) {
        String s = "abcbbc";
        System.out.println(countSubstrings(s));
    }
    public static int countSubstrings(String s) {
        int n = s.length();
        boolean[][] dp = new boolean[n][n];
        int count = 0;

        for (int g = 0; g < s.length(); g++) {
            for (int i = 0,j=g; j <dp.length ; i++,j++) {
                if(g == 0){
                    dp[i][j]=true;
                    count++;
                }else if(g == 1){
                    if(s.charAt(i)==s.charAt(j)){
                        dp[i][j] = true;
                        count++;
                    }
                }
                else{
                    if((s.charAt(i)==s.charAt(j)) && dp[i+1][j-1]){
                        dp[i][j] =true;
                        count++;
                    }
                }
            }
        }
        /*
        //for 1 character substring
        for (int i = 0; i < n; i++) {
            dp[i][i] = true;
            count++;
        }
        //for 2 character substring
        for (int i = 0; i < n - 1; i++) {
            if(s.charAt(i) == s.charAt(i+1)){
                dp[i][i+1] = true;
                count++;
                
            }
        }
        
        //for more than 2 character substring

        for (int len = 3; len <= n; len++) {
            for (int i = 0,j = i+len-1;j<n; i++,j++) {
                if(s.charAt(i)==s.charAt(j) && dp[i+1][j-1]){
                    dp[i][j] = true;
                    count++;
                }
            }

        }

         */


        return count;
        
    }
}
