package DynamicProgramming;

import java.util.*;

public class CountUniqueCharactersofAllSubstringsOfAGivenString {
    public static void main(String[] args) {
        String str = "aba";
        int ans  = nonPalin(str);
        System.out.println(ans);


    }
    public static int nonPalin(String s){
        ArrayList<String> ans = new ArrayList<>();
        int n = s.length();
        boolean[][] dp = new boolean[n][n];
        for (int g = 0; g < n; g++) {
            for (int i = 0,j=g; j<n ;j++, i++) {

                if(j>=i){
                    ans.add(s.substring(i,j+1));
                }

            }

        }
        System.out.println(ans);
        int count = 0;
        for (String str: ans) {
            count = count + getCountOf(str);
        }
        int dup = -1;
        for (String str : ans){
            dup = containsDup(str);
            count = count-dup;
        }
        return count;
    }
    public static int getCountOf(String s){
        return s.length();
    }
    public static int containsDup(String s){
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }
            else {
                map.put(ch,1);
            }
        }
        int c =0;
        for (Map.Entry m:map.entrySet()) {
            if((int)m.getValue() > 1){
                c = c+(int)m.getValue();
            }
        }
        return c;
    }
}
