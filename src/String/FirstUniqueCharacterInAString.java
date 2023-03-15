package String;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/first-unique-character-in-a-string/


public class FirstUniqueCharacterInAString {
    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(firstUniqChar(s));
        System.out.println(firstUniqChar2(s));
        System.out.println(firstUniqChar3(s));
    }
    public static int firstUniqChar3(String s){
        char[] count = new char[26];

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i)-'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if(count[s.charAt(i)-'a']==1){
                return i;
            }
        }
        return -1;
    }
    public static int firstUniqChar2(String s){
        char[] ch = s.toCharArray();
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[ch[i]-'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            if(count[ch[i]-'a'] == 1){
                return i;
            }
        }
        return -1;
    }

    public static int firstUniqChar(String s) {
        HashMap<Character,Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }
            else map.put(c,1);
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(map.get(c) == 1)
                return i;
        }

//        ArrayList<Character> list = new ArrayList<>();
//        for (Map.Entry<Character,Integer> m: map.entrySet()) {
//            if(m.getValue() == 1){
//                list.add(m.getKey());
//            }
//        }
//        for (int i = 0; i < s.length(); i++) {
//            char c = s.charAt(i);
//            if(list.contains(c)){
//                return i;
//            }
//        }
        return -1;

    }
}
