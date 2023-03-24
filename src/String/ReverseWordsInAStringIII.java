package String;

//https://leetcode.com/problems/reverse-words-in-a-string-iii/

import java.util.Arrays;

public class ReverseWordsInAStringIII {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s));


    }
    public static String reverseWords(String s) {
        String [] str = s.split(" ");
        System.out.println(Arrays.toString(str));
        String ans = "";

        for (String S:str) {
            ans = ans + new StringBuilder(S).reverse().toString()+" ";

        }
        ans = ans.trim();

        return ans;
    }
}
