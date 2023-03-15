package String;

//https://leetcode.com/problems/break-a-palindrome/

public class BreakAPalindrome {
    public static void main(String[] args) {
        String palin = "abccba";
        System.out.println(breakPalindrome(palin));


    }
    public static String breakPalindrome(String palindrome) {
        int n = palindrome.length();
        if(n == 1) return "";
        char[] ch = palindrome.toCharArray();
        for (int i = 0; i < n/2; i++) {
            if(ch[i] != 'a'){
                 ch[i] = 'a';
                 return String.valueOf(ch);
            }
        }
        ch[n-1] = 'b';
        return String.valueOf(ch);


    }
}
