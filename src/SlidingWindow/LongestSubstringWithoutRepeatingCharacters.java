package SlidingWindow;
import java.util.*;
// https://leetcode.com/problems/longest-substring-without-repeating-characters/
public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String s = "abcabcbb";
       // System.out.println(lengthOfLongestSubstring(s));
        System.out.println(lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s) {
        //return getMaxLen(s,0);
        return getMaxLen2(s,0);
    }
    public static int getMaxLen2(String str,int maxLen){
        HashSet<Character> set = new HashSet<>();
        int i =0;
        int j = 0;

        while(j<str.length()){
            if(!set.contains(str.charAt(j))){
                set.add(str.charAt(j));
                j++;
                if(maxLen<set.size()){
                    maxLen = set.size();
                }
            }
            else{
                set.remove(str.charAt(i));
                i++;
            }
        }
        return maxLen;
    }
    public static int getMaxLen(String s,int maxLen) {
        int i = 0;
        int j =0;

        HashSet<Character> set = new HashSet<>();
        while (j<s.length()){
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j));

                if(set.size()>maxLen){
                    maxLen = set.size();
                }
                j++;
            }else{
                set.remove(s.charAt(i));
                i++;
            }

        }
        return maxLen;

    }
}
