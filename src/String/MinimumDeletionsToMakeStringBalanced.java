package String;

//https://leetcode.com/problems/minimum-deletions-to-make-string-balanced/

public class MinimumDeletionsToMakeStringBalanced {
    public static void main(String[] args) {
        String s = "aababbab";
        System.out.println(minimumDeletions(s));
    }
    public static int minimumDeletions(String s) {
        int ans = 0, countB = 0;

        for (Character ch: s.toCharArray()) {
            if(ch == 'b'){
                countB++;
            }
            if(ch == 'a' && countB > 0){
                ans++;
                countB--;
            }
        }
        return ans;
    }
}
