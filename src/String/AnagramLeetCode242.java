package String;

import java.util.Arrays;

public class AnagramLeetCode242 {
    public static void main(String[] args) {
        String s = "ab";
        String t = "a";
        System.out.println(isAnalgram(s,t));
        System.out.println(isAnagramSaiful(s,t));

    }
    public static boolean isAnalgram(String s,String t){
        if(s.length() != t.length()) return false;
        int[] count = new int[256]; //max value of character
        for(int i=0;i<s.length();i++){
            count[s.charAt(i)+0]++;
        }
        for (int i = 0; i < t.length(); i++) {
            count[t.charAt(i)-0]--;

        }
        for (int i = 0; i < s.length(); i++) {
            if(count[i] != 0){
                return false;
            }

        }

        return true;
    }
    public static boolean isAnagramSaiful(String s, String t) {
        char[] chs = s.toCharArray();
        char[] cht = t.toCharArray();
        Arrays.sort(chs);
        Arrays.sort(cht);
        if(chs.length != cht.length){
            return false;
        }
        int i = 0;
        while(i<cht.length){
            if(chs[i] != cht[i]){
                return false;
            }
            i++;
        }

        return true;
    }
}
