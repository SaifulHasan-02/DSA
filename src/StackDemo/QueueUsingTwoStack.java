package StackDemo;

import java.util.Stack;

public class QueueUsingTwoStack {
    Stack<Integer>s1 = new Stack<>();
    Stack<Integer>s2 = new Stack<>();

    void enqueue(int x){

        while (!s1.isEmpty()){
            s2.push(s1.pop());
        }
        s1.push(x);
        while (!s2.isEmpty()){
            s1.push(s2.pop());
        }

    }
    int dequeue(){
        if(s1.isEmpty()){
            System.out.println("queue is Empty");
            return -1;
        }
        return s1.pop();
    }
    int top(){
        if(s1.isEmpty()){
            System.out.println("queue is Empty");
            return -1;
        }
        return s1.peek();
    }

    public static void main(String[] args) {
        QueueUsingTwoStack q = new QueueUsingTwoStack();

        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.top());
    }
}
