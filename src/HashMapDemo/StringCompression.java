package HashMapDemo;
//https://leetcode.com/problems/string-compression/description/
//wrong ans hai q ki question dislike bhut hai
import java.util.HashMap;
import java.util.Map;

public class StringCompression {
    public static void main(String[] args) {
        char[] chars = {'a','a','b','b','c','c','c'};
        System.out.println(compress(chars));
    }
    public static int compress(char[] chars){
        HashMap<Character,Integer>map = new HashMap<>();

        for(char ch : chars){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        StringBuilder sb = new StringBuilder();

        for (Map.Entry<Character, Integer> m : map.entrySet()) {
            sb.append(m.getKey());
            sb.append(m.getValue());
            map.remove(m);
        }
        int ind = 0;
        for (int i = 0; i < sb.length(); i++) {
            chars[ind++] = sb.charAt(i);
        }
        return ind;

    }
}
