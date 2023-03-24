package String;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//https://leetcode.com/problems/longest-palindromic-subsequence/
public class LongestPalindromicSubsequence {
    public static void main(String[] args) {
        String s = "aba";
        //System.out.println(longestPalindromeSubseq(s));
       System.out.println(longestPalindromeSubseq2(s));
        /*
        String str = "  abc ";
        System.out.println(str);
        System.out.println(str.length());
        str = str.trim(); //used to remove leading and trailing space only
        System.out.println(str);
        System.out.println(str.length());

         */



    }
    public static int longestPalindromeSubseq2(String s){
        List<String> list = subseq2(s,"","");
        System.out.println(list);
        int max = 0;
        for(String str : list){
            if(str.length()>max){
                max = str.length();
            }
        }
        return max;


    }
    public static int longestPalindromeSubseq(String s) {
        ArrayList<String> list = new ArrayList<>();

        subseq(s,"","",list);
        System.out.println(list);

        int max = 0;
        for(String str : list){
            if(str.length()>max){
                max = str.length();
            }
        }
        return max;

    }
    public static void subseq(String s,String up,String p,ArrayList<String>list){

        if(s.length() == 0){
            if(p.equals(up)){
                list.add(up);

            }
            return;
        }

        char ch = s.charAt(0);
        subseq(s.substring(1),up+ch,ch+p,list);
        subseq(s.substring(1),up,p,list);
    }
    public static List<String> subseq2(String s,String up,String p){

        if(s.length() == 0){
            List<String> inner = new LinkedList<>();
            if(p.length() ==0){
                inner.add("[]");
            }

            else if(p.equals(up)){
                inner.add(p);

            }
            return inner;
        }

        char ch = s.charAt(0);
        List<String>left = subseq2(s.substring(1),up+ch,ch+p);
        List<String>right = subseq2(s.substring(1),up,p);
        left.addAll(right);
        return left;

    }


}
