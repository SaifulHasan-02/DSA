package String;
import java.util.*;
//https://leetcode.com/problems/find-and-replace-pattern/
public class FindAndReplacePattern {
    public static void main(String[] args) {
        String[] words = {"abc","deq","mee","aqq","dkd","ccc"};
        String pattern = "abb";
        System.out.println(findAndReplacePattern(words,pattern));
    }


    public static List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> ans = new ArrayList<>();

        for (String s:words) {
            if(isCheck(s,pattern)){
                ans.add(s);
            }
        }
        return ans;
    }
    static boolean isCheck(String s,String pattern){

        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.indexOf(s.charAt(i)));
            System.out.println(pattern.indexOf(pattern.charAt(i)));
            System.out.println();
            if(s.indexOf(s.charAt(i)) != pattern.indexOf(pattern.charAt(i))){
                return false;
            }
        }
        return true;
    }


}
