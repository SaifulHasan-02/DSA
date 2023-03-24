package LeetCode;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
    //glt hai shi kro


        public static int lengthOfLongestSubstring(String s) {
            int n = s.length();
            boolean[][] dp = new boolean[n][n];

            for(int i =0;i<n;i++){
                dp[i][i] = true;
            }

            for(int i = 0;i<n-1;i++){
                if(s.charAt(i) != s.charAt(i+1)){
                    dp[i][i+1] = true;
                }
            }

            for(int len = 3;len<=n;len++){
                for(int i =0,j=len-1+i;j<n;i++,j++){
                    if(s.charAt(i) != s.charAt(j) && dp[i][j]){
                        dp[i][j] = true;
                    }
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(dp[i][j]+" ");
                }
                System.out.println();
            }
            int max = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    int curMax = 0;
                    if(dp[i][j]){
                        curMax = j-i+1;
                        if(max < curMax){
                            max = curMax;
                        }
                    }

                }
            }
            return max;

        }

}
