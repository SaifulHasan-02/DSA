package Array;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

//https://leetcode.com/problems/reduce-array-size-to-the-half/

public class ReduceArraySizeToTheHalf {
    public static void main(String[] args) {
        int[] arr = {9,77,63,22,92,9,14,54,8,38,18,19,38,68,58,19};
        System.out.println(minSetSize(arr));
    }
    public static int minSetSize(int[] arr) {
        int n = arr.length;
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int e : arr){
            map.put(e,map.getOrDefault(e,0)+1);
        }
        System.out.println(map);

        PriorityQueue<Map.Entry<Integer,Integer>> pq = new PriorityQueue<Map.Entry<Integer, Integer>>((a,b) ->  b.getValue()-a.getValue());

        pq.addAll(map.entrySet());
        int count = 0;
        int cE = 0;
        while (!pq.isEmpty()){
            Map.Entry<Integer,Integer> m = pq.poll();
            count += m.getValue();
            cE += 1;
            if(count>= n/2){
                return cE;
            }

        }
        return cE;

    }
}
