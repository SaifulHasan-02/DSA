package String;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FirstLetterToAppearTwice {
    public static void main(String[] args) {
        String s = "abccbaacz";
        System.out.println(repeatedCharacter(s));

    }
    public static char repeatedCharacter(String s) {
        HashMap<Character,Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }
            else map.put(c,1);
        }
        ArrayList<Character> list = new ArrayList<>();
        for (Map.Entry<Character,Integer> m: map.entrySet()) {
            if(m.getValue() == 2){
                list.add(m.getKey());
            }
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(list.contains(c)){
                return c;
            }
        }
        return 0;
    }
}
