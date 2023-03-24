package String;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class CognizantNext {
    public static void main(String[] args) {
        String str = "My Name is Fran";
        String t = "rim";
        System.out.println(isContains(str,t));
        System.out.println(isContains2(str,t));
        System.out.println(isContains3(str,t));
    }
    public static boolean isContains3(String s,String t){
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < t.length(); i++) {
            set.add(t.charAt(i));
        }
        int c = 0;
        for (int i = 0; i < s.length(); i++) {
            if(set.contains(s.charAt(i))){
                c++;
            }
        }
        return c == t.length();
    }
    private static boolean isContains2(String s,String t){
        int n1 = s.length();
        int n2 = t.length();
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < n1; i++) {
            map.put(s.charAt(i),i);
        }
        for (int i = 0; i < n2; i++) {
            if(!map.containsKey(t.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    private static boolean isContains(String str, String t) {
        int n1 = str.length();
        int n2 = t.length();

        for(int i=0;i<n2;i++){
            boolean flag = false;
            for (int j = 0; j < n1; j++) {
                if(t.charAt(i) == str.charAt(j)) {
                    flag = true;
                }
            }
            if(!flag){
                return false;
            }

        }
        return true;
    }

}
