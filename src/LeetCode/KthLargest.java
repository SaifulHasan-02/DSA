package LeetCode;

import java.util.PriorityQueue;

public class KthLargest {
    int k;
    PriorityQueue<Integer> pq;
    public KthLargest(int k,int[] nums){
        this.k = k;
        pq = new PriorityQueue<>(k);
        for (int e:nums) {
            pq.add(e);
            if(pq.size()>k){
                pq.poll();
            }
        }

    }
    public int add(int val){
        pq.add(val);
        if(pq.size()>k){
            pq.poll();
        }
        //return pq.peek();
        return pq.size()>0?pq.peek():-1;

    }
}
