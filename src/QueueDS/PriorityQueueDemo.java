package QueueDS;

import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        PriorityQueue<Integer> pq2 = new PriorityQueue<>(Collections.reverseOrder());
        pq.add(32);
        pq.add(31);
        pq.add(27);
        pq.add(28);
        pq.add(16);
        pq.add(20);
        System.out.println(pq);
        /*
        Iterator itr = pq.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        Object[] arr = pq.toArray();
        for (Object obj :arr) {
            System.out.println(obj);
        }
        for (int ele: pq ) {
            System.out.println(ele);
        }

        System.out.println(pq);
        System.out.println(pq.peek());
        System.out.println(pq.poll());
        System.out.println(pq.peek());
        System.out.println(pq);
         */

    }
}
