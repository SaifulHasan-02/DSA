package String;

//https://leetcode.com/problems/sort-characters-by-frequency/

import java.util.*;

public class SortCharactersByFrequency {
    public static void main(String[] args) {
        String s = "raaeaedere";
        System.out.println(frequencySort(s));//TLE
        System.out.println(frequencySort2(s));

    }
    public static String frequencySort2(String s){
//        PriorityQueue<Map.Entry<Character,Integer>> pq = new PriorityQueue<>(new Comparator<Map.Entry<Character, Integer>>() {
//            @Override
//            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
//                return o2.getValue()-o1.getValue();
//
//            }
//        });
        PriorityQueue<Map.Entry<Character,Integer>> pq = new PriorityQueue<>((a,b) -> b.getValue()-a.getValue());

        int[][] mat = new int[5][2];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 2; j++) {
                mat[i][j] = i+2;
            }
        }

//        Arrays.sort(mat, new Comparator<int[]>() {
//            @Override
//            public int compare(int[] o1, int[] o2) {
//                return o2[1]-o1[1];
//            }
//        });

//        Arrays.sort(mat,(a,b) -> b[1]-a[1]);
//
//        for (int[] arr:mat) {
//            System.out.println(Arrays.toString(arr));
//        }

//        HashMap<Character,Integer> map = new HashMap<>();

//        for (Character c:s.toCharArray()) {
//            map.put(c,map.getOrDefault(c,1)+1);
//        }


        HashMap<Character,Integer> map = new HashMap<>();
        for (Character c: s.toCharArray()){
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }
            else{
                map.put(c,1);
            }
        }
//        System.out.println(map);
        pq.addAll(map.entrySet());
//        for (Map.Entry<Character,Integer>m:map.entrySet()) {
//            pq.add(m);
//        }
        String ans = "";

        while (!pq.isEmpty()){
            Map.Entry<Character,Integer>m = pq.poll();
            for (int i = 0; i < m.getValue(); i++) {
                ans += m.getKey();
            }
        }

        return ans;
    }

    public static String frequencySort(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else map.put(c,1);
        }

        List<Map.Entry<Character,Integer> > li = new LinkedList<>(map.entrySet());

        li.sort(new Comparator<Map.Entry<Character, Integer>>() {
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                return (o2.getValue()).compareTo(o1.getValue());
            }
        });

        HashMap<Character, Integer> temp = new LinkedHashMap<Character, Integer>();
        for (Map.Entry<Character, Integer> aa : li) {
            temp.put(aa.getKey(), aa.getValue());
        }

        String ans = "";
        for (Map.Entry<Character,Integer> m: temp.entrySet()){
            for (int i = 0; i < m.getValue(); i++) {
                ans += m.getKey();
            }

        }
        return ans;
    }

}
