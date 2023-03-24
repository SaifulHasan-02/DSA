package String;

import java.util.*;

public class TopKFrequentWords {
    public static void main(String[] args) {
        String[] words = {"the","day","is","sunny","the","the","the","sunny","is","is"};
        int k = 4;

        System.out.println(topKFrequent(words,k));
    }

    public static List<String> topKFrequent(String[] words, int k) {
        List<String>ans = new ArrayList<>();
        int  n = words.length;

        HashMap<String,Integer>map = new HashMap<>();

        PriorityQueue<Map.Entry<String,Integer>>pq = new PriorityQueue<>((a,b)-> a.getValue()==b.getValue()?a.getKey().compareTo(b.getKey()):b.getValue()-a.getValue());
        for (String s:words) {
            map.put(s,map.getOrDefault(s,0)+1);
        }
        for(Map.Entry<String,Integer>m : map.entrySet()){
            pq.offer(m);
        }
        for (int i = 0; i < k; i++) {
            ans.add(pq.poll().getKey());
        }

        return ans;

    }
}
