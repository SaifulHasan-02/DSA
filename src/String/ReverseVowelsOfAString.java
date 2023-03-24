package String;

// https://leetcode.com/problems/reverse-vowels-of-a-string/

import static String.ReverseVovels.swap;

public class ReverseVowelsOfAString {
    public static void main(String[] args) {
        String s = "hello";
        System.out.println(reverseVowels(s));
    }
    public static String reverseVowels(String s){
        int start = 0, end = s.length()-1;
        char[]ch = s.toCharArray();
        while (start < end){

            while (start<end && !isVowels(ch[start])){
                start++;
            }
            while (start<end && !isVowels(ch[end])){
                end--;
            }
            if(start < end){
                swap(ch,start,end);
                start++;
                end--;
            }
        }
        return new String(ch);
    }

    private static boolean isVowels(char ch) {
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
            return true;
        }
        return false;
    }

}
