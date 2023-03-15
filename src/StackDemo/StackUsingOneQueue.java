package StackDemo;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingOneQueue {
    Queue<Integer> q = new LinkedList<>();

    void push(int x){
        q.add(x);
        for (int i =0;i<q.size()-1;i++){
            q.add(q.remove());
        }

    }
    int pop(){
        if(q.isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        return q.remove();
    }
    int top(){
        if(q.isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        return q.peek();
    }


    public static void main(String[] args) {
        StackUsingOneQueue s = new StackUsingOneQueue();
        System.out.println(s.pop());
        s.push(1);
        s.push(2);
        s.push(23);


    }
}
