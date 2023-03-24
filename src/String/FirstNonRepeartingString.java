package String;
//https://practice.geeksforgeeks.org/problems/non-repeating-character-1587115620/1/#
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class FirstNonRepeartingString {
    public static void main(String[] args) {
        String str = "zxvczbtxyzvy";
        System.out.println(nonrepeatingCharacter(str));
        System.out.println(nonrepeatingCharacter2(str));
    }
    public static char nonrepeatingCharacter2(String s){
        HashMap<Character,Integer>map = new HashMap<>();

        for(Character c : s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        for (int i = 0; i < s.length(); i++) {
            if(map.containsKey(s.charAt(i)) && map.get(s.charAt(i))==1){
                return s.charAt(i);
            }
        }
        return '$';
    }
    static char nonrepeatingCharacter(String S){
        int n = S.length();
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if(map.containsKey(S.charAt(i))){
                map.put(S.charAt(i),map.get(S.charAt(i))+1);
            }else{
                map.put(S.charAt(i),1);
            }
        }
        ArrayList<Character> list = new ArrayList<>();
        for (Map.Entry e : map.entrySet()){
            if((int)e.getValue() == 1){
                list.add((Character) e.getKey());
            }
        }
        //char ans = ' ';
        for (int i = 0; i < n; i++) {
            for (char c:list) {
                if(S.charAt(i)==c){
                    return c;
                }
            }
        }
        return '$';
    }

}
