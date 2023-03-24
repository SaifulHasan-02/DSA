package String;
//https://practice.geeksforgeeks.org/problems/remove-character3815/1


import java.util.*;
import java.util.LinkedList;

public class RemoveCharacter {
    public static void main(String[] args) {

        String s1 = "jznpcsojzozgpc";
        String s2 = "toaewnevyxlir";
        /*
        HashMap<Character,Integer> map = new HashMap<>();
        LinkedList<Map.Entry<Character,Integer>>list = new LinkedList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue());

         */

        System.out.println(removeChars3(s1,s2));
    }

    private static String removeChars3(String s1,String s2){
        String ans = "";

        int n1 = s1.length();
        int n2 = s2.length();
        for(int i =0;i<n1;i++) {
            boolean flag = false;
            for (int j = 0; j < n2; j++) {
                if (s1.charAt(i) == s2.charAt(j)) {
                    flag = true;
                }
            }
            if (!flag) {
                ans = ans + s1.charAt(i);
            }
        }
        return ans;
    }

}
