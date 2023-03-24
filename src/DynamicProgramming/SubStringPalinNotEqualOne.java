package DynamicProgramming;

import java.util.*;

public class SubStringPalinNotEqualOne {
    public static void main(String[] args) {
        String str = "aabbbaa";
        System.out.println(getSubString(str));
    }
    public static List<String> getSubString(String s){
        List<String> ans = new ArrayList<>();
        boolean[][] dp = new boolean[s.length()][s.length()];
        for (int g = 0; g < s.length(); g++) {
            for (int i = 0,j=g; j < s.length() ;j++, i++) {
                if(g == 0){
                    dp[i][j] = true;
                }
                else {
                    boolean b = s.charAt(i) == s.charAt(j);
                    if(g == 1){
                        if(b){
                            dp[i][j] = true;
                        }
                    }
                    else{
                        if(b && dp[i+1][j-1]){
                            dp[i][j] = true;
                        }
                    }
                }
                if(dp[i][j] && g != 0){
                    ans.add(s.substring(i,j+1));
                }
            }
        }
        return ans;

    }
}
