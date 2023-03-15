package LeetCode;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class LastStoneWeight {
    public static void main(String[] args) {
        int[] arr = {2,7,4,1,8,1};
        //System.out.println(lastStoneWeight(arr));
        System.out.println(lastStoneWeightOpt(arr));
    }

    private static int lastStoneWeightOpt(int[] arr) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
        for (int e: arr) {
            pq.add(e); //T(n) = O(log(n))
        }
        System.out.println(pq);
        while (pq.size()>1){    //T(n) = O(n*log(n))
            int last = pq.poll(); //T(n) = O(log(n))
            int secondLast = pq.poll(); //T(n) = O(log(n))
            if(last != secondLast){
                pq.offer(last-secondLast);
            }
        }
      return pq.isEmpty() ? 0 :pq.peek(); //T(n) + O(1)
    }


    //T(n) = O(n^2 log(n))
    public static int lastStoneWeight(int[] stones) {
        //Arrays.sort(stones);
        for (int i = 0; i <stones.length-2 ; i++) {
            Arrays.sort(stones);
            int diff = stones[stones.length-1-i]-stones[stones.length-2-i];
            //stones[stones.length-1-i] = ;
            stones[stones.length-2-i] = diff;

        }
        return stones[0];


    }
}
