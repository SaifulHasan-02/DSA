package String;

import java.util.HashMap;
import java.util.Map;

public class PrintRepeatedCharacterInString {
    public static void main(String[] args) {
        String s = "aabcdbd";
        printRepeatedCharacter2(s);
        System.out.println();
        printRepeatedCharacter(s);

    }
    public static void printRepeatedCharacter2(String s){
        char[] ch = s.toCharArray();
        int n = s.length();

        for (int i = 0; i < n-1; i++) {
            int count = 1;
            for (int j = i+1; j < n; j++) {
                if(ch[i] == ch[j]){
                    count++;
                }
            }
            if(count>1){
                System.out.println(ch[i]);
            }
        }
    }
    public static void printRepeatedCharacter(String s){
        HashMap<Character,Integer>map = new HashMap<>();

        for (Character c : s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        for (Map.Entry<Character,Integer> m:map.entrySet()) {
            if(m.getValue()>1){
                System.out.println(m.getKey());
            }
        }
    }
}
