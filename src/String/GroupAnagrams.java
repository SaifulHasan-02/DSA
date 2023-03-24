package String;
import java.util.*;

//https://leetcode.com/problems/group-anagrams/
public class GroupAnagrams {
    public static void main(String[] args) {
        String[] str = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(str));
        System.out.println(groupAnagrams2(str));

    }
    public static List<List<String>> groupAnagrams2(String[] strs){
        List<List<String>> outer = new ArrayList<>();

        HashMap<String,ArrayList<String>> map = new HashMap<>();

        for (String s:strs) {
            char[] count = new char[26];
            for (char c:s.toCharArray()) {
                count[c-'a']++;
            }
            String st = new String(count);
            if(map.containsKey(st)){
                map.get(st).add(s);
            }
            else{
                map.put(st,new ArrayList<>());
                map.get(st).add(s);
            }
        }
        for(Map.Entry<String,ArrayList<String>> m : map.entrySet()){
            outer.add(m.getValue());
        }
        return outer;
    }
    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> outer = new ArrayList<>();

        HashMap<String ,ArrayList<String>> map = new HashMap<>();

        for (String s:strs) {
            char[] count = new char[26];
            for (int i = 0; i < s.length();i++) {
                count[s.charAt(i)-'a']++;
            }

            String st = new String(count);
            if(map.containsKey(st)){
                map.get(st).add(s);

            }else{
                map.put(st,new ArrayList<>());
                map.get(st).add(s);
            }
        }

        for (Map.Entry<String,ArrayList<String>> m : map.entrySet()){
            outer.add(m.getValue());
        }
        return outer;
    }
}
