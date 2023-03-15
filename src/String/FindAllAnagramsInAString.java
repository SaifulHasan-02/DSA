package String;
import java.util.List;
import java.util.ArrayList;

//https://leetcode.com/problems/find-all-anagrams-in-a-string/

public class FindAllAnagramsInAString {
    public static void main(String[] args) {
        String s = "abab";
        String p = "ab";
        System.out.println(findAnagrams(s,p));


    }

    public static List<Integer> findAnagrams(String s, String p) {
        char[] chS = s.toCharArray();
        char[] chP = p.toCharArray();
        List<Integer> ans = new ArrayList<>();
        int k = p.length() , i = 0,j = 0;


        while (i <= j && j< s.length()){
            if(j-i+1 <k){
                j++;
            }
            else if(j-i+1 == k){
                if(isFind(chS,chP,i,j)){
                    ans.add(i);
                }
                i++;
                j++;
            }
        }
        return ans;

    }
    public static boolean isFind(char[] chS,char[] chP,int s,int e){
        int[] count = new int[26];
        for (;s<=e;s++){
            count[chS[s]-'a']++;
        }
        for (char c : chP) {
            count[c - 'a']--;
        }
        for (int el:count) {
            if(el > 0)
                return false;
        }
        return true;
    }
}
