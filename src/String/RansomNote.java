package String;
//https://leetcode.com/problems/ransom-note/
import java.util.HashMap;

public class RansomNote {
    public static void main(String[] args) {
        String ransomNote = "aa";
        String magazine = "ab";
        System.out.println(canConstruct(ransomNote,magazine));
        System.out.println(canConstruct2(ransomNote,magazine));

    }
    public static boolean canConstruct2(String ransomNote,String magazine){
        int[] count = new int[26];

        for (char c: magazine.toCharArray()){
            count[c - 'a']++;
        }
        char[] ch = ransomNote.toCharArray();
        for (int i = 0; i < ransomNote.length(); i++) {
            count[ch[i]-'a']--;
        }
        for (int i:count) {
            if(i < 0)
                return false;
        }
        return true;
    }
    public static boolean canConstruct(String ransomNote, String magazine) {

        int m = magazine.length();
        HashMap<Character,Integer> map = new HashMap<>();
        char[] mag = magazine.toCharArray();
        for(int i=0;i<m;i++){
            map.put(mag[i],map.getOrDefault(mag[i],0)+1);
        }

        char[] ras = ransomNote.toCharArray();
        int count = 0;
        for(Character c : ras){
            if(map.containsKey(c) && map.get(c)>0){
                count++;
                map.put(c,map.get(c)-1);
            }else{
                break;
            }
        }

        return count == ras.length;
    }
}
