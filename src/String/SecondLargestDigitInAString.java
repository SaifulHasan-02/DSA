package String;

//https://leetcode.com/problems/second-largest-digit-in-a-string/

import java.util.Collections;
import java.util.PriorityQueue;

public class SecondLargestDigitInAString {
    public static void main(String[] args) {
        String s = "dfa12321afd";
        System.out.println(secondHighest(s));
    }
    public static int secondHighest(String s) {
        PriorityQueue<Integer>pq = new PriorityQueue<>(Collections.reverseOrder());

        for(Character ch : s.toCharArray()){
            if(ch >= '0' && ch <= '9'){
                int d = Character.getNumericValue(ch);
                if(!pq.contains(d))
                    pq.offer(d);
            }
        }

        if(pq.size()<2){
            return -1;
        }
        pq.poll();
        return pq.peek();

    }
}
