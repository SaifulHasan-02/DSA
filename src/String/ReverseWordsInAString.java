package String;

//https://leetcode.com/problems/reverse-words-in-a-string/

import java.util.Arrays;

public class ReverseWordsInAString {
    public static void main(String[] args) {
        String s = "a good   example";
        System.out.println(reverseWords(s));

    }
    public static String reverseWords(String s) {
        String[]str = s.split(" ");

        reverse(str);
        StringBuilder sb = new StringBuilder();

        for (String s1:str) {
            if(s1.equals("")){
                continue;
            }
            else{
                sb.append(s1).append(" ");
            }
        }
        return sb.toString().trim();
    }
    public static void reverse(String[] str) {
        int start = 0, end = str.length - 1;

        while (start < end){
            String s = str[start];
            str[start] = str[end];
            str[end] = s;
            start++;
            end--;
        }
    }
}
