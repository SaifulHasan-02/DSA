package String;

import java.util.*;
//https://leetcode.com/problems/minimum-deletions-to-make-character-frequencies-unique/
public class MinimumDeletionstomakeCharacterFrequenciesUnique {
    public static void main(String[] args) {
        String s = "aabbcc";
        System.out.println(minDeletions(s));
    }
    public static int minDeletions(String s) {
        HashMap<Character,Integer> map = new HashMap<>();

        for(int i =0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }else{
                map.put(s.charAt(i),1);
            }
        }
        ArrayList<Integer> freq = new ArrayList<>();

        for (Map.Entry m:map.entrySet()) {
            freq.add((Integer) m.getValue());
        }
        Collections.sort(freq);
        System.out.println(freq);
        Collections.reverse(freq);
        System.out.println(freq);
        int maxFreq = freq.get(0);
        int ans = 0;

        for (Integer a:freq) {
            if(a > maxFreq){
                if(maxFreq>0) {
                    ans++;
                    maxFreq--;
                }
                else{
                    ans = ans + a;
                }
            }
            maxFreq = Math.min(maxFreq-1,a-1);
        }
        return ans;
        /*
        LinkedList<Map.Entry<Character,Integer>>list = new LinkedList<Map.Entry<Character,Integer>>(map.entrySet());
        list.sort(Map.Entry.comparingByValue());
        System.out.println(list);

         */


    }
}

