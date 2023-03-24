package Contest;

import java.util.Arrays;

public class ValidAnagram {
    public static void main(String[] args) {
        String s = "bjmvpheuulldqx";
        String t = "cbmdglasmydtag";
        //System.out.println(isAnagram(s,t));
        System.out.println(isAnagramOptimal(s,t));
    }
    public static boolean isAnagramOptimal(String s,String t){
        if(s.length() != t.length())return false;

        int[] count = new int[256];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i)]++;
        }
        for (int i = 0; i < t.length(); i++) {
            count[t.charAt(i)]--;
        }
        for (int i = 0; i < s.length(); i++) {
            if(count[i] != 0) return false;
        }
        return true;
    }
    public static boolean isAnagram(String s,String t){
        int n = s.length();
        int m = t.length();
        if(n != m){
            return false;
        }
        char[] st = s.toCharArray();
        char[] tt = t.toCharArray();
        Arrays.sort(st);
        Arrays.sort(tt);

        for (int i = 0; i < n; i++) {
            if(st[i] != tt[i]){
                return false;
            }
        }
        return true;
    }
}
