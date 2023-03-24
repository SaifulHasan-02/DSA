package QueueDS;

import java.util.ArrayDeque;

import java.util.Deque;


public class DequeDemo {
    public static void main(String[] args) {

        Deque<Integer> dq = new ArrayDeque<>();
        dq.add(4);
        dq.add(6);
        dq.add(2);
        dq.add(1);
        dq.add(10);
        System.out.println(dq);
    }

}
