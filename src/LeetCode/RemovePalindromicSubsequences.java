package LeetCode;
//https://leetcode.com/problems/remove-palindromic-subsequences/
public class RemovePalindromicSubsequences {
    public static void main(String[] args) {
        String s = "abb";
        System.out.println(removePalindromeSub(s));
        System.out.println(removePalindromeSub2(s));
    }
    public static int removePalindromeSub2(String str){
        StringBuilder s = new StringBuilder(str);
        StringBuilder sr = s.reverse();

        if(str.equals(sr.toString())){
            return 1;
        }
        return 2;
    }
    public static int removePalindromeSub(String s) {
        if(isPalindrome(s)){
            return 1;
        }
        return 2;
    }
    public static boolean isPalindrome(String s){
        int start = 0;
        int end = s.length()-1;
        while(start  < end){
            if(s.charAt(start) != s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
