package String;

import java.util.Locale;

public class Palindrome {
    public static void main(String[] args) {
        String s = "adam";

        String str = new StringBuilder(s).reverse().toString();

        System.out.println(isPalindrome(s));
        System.out.println(isPalindrome2(s));
    }
    public static boolean isPalindrome(String str){
        if(str == null || str.length()==0){
            return true;
        }
        String p = "";
        str = str.toLowerCase();
        for(int i =0;i<str.length();i++){
            p = str.charAt(i)+p;
        }

        return p.equals(str);
    }
    public static boolean isPalindrome2(String str){
        if(str.length() == 0)
            return true;
        str = str.toLowerCase();
        for(int i=0;i<str.length();i++){
            char start = str.charAt(i);
            char end = str.charAt(str.length()-1-i);
            if(start != end) {
                return false;
            }
        }
        return true;
    }
}
