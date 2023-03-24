package LeetCode;

import java.util.Locale;
import java.util.Stack;

//https://leetcode.com/problems/valid-palindrome/
public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "0P";
        System.out.println(isPalindrome(s));
    }
    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        String p = "";
        String up = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if((ch >= '0' && ch <= '9')|| (ch >= 'a' && ch<='z')){
                p = ch + p;
                up = up + ch;
            }
        }
        return p.equals(up);

    }
}
