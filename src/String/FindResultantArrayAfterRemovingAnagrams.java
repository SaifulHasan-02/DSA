package String;

//https://leetcode.com/problems/find-resultant-array-after-removing-anagrams/

import java.util.*;

public class FindResultantArrayAfterRemovingAnagrams {
    public static void main(String[] args) {
        String[] words = {"a","b","a"};
        System.out.println(removeAnagrams(words));
    }
    public static List<String> removeAnagrams(String[] words) {
        List<String> ans = new ArrayList<>();
        LinkedHashMap<String,String> map = new LinkedHashMap<>();

        for (String s: words) {
            char[] count = new char[26];

            for (char c: s.toCharArray()) {
                count[c-'a']++;
            }
            String st = new String(count);

            if(!map.containsKey(st)){
                map.put(st,s);

            }
        }

        for(Map.Entry<String,String>m : map.entrySet()){
            ans.add(m.getValue());
        }
        return ans;
    }
}
