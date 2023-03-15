package Array;

import java.util.LinkedList;
import java.util.Queue;
public class StackUsingTwoQueue {
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    void push(int x){
        while(!q1.isEmpty()){
            q2.add(q1.remove());
        }
        q1.add(x);
        while (!q2.isEmpty()){
            q1.add(q2.remove());
        }
    }
    int pop(){
        if(q1.isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        return q1.remove();
    }
    int top(){
        if(q1.isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        return q1.peek();
    }
    boolean isEmpty(){
        return q1.isEmpty();
    }

    public static void main(String[] args) {
        StackUsingTwoQueue stk = new StackUsingTwoQueue();
        stk.push(1);
        stk.push(2);
        stk.push(3);
        stk.push(4);
        stk.push(5);

        System.out.println(stk.top());
        System.out.println(stk.pop());
        System.out.println(stk.pop());
        System.out.println(stk.pop());
        System.out.println(stk.top());
        System.out.println(stk.isEmpty());
        System.out.println(stk.pop());
        System.out.println(stk.pop());
        System.out.println(stk.pop());
        System.out.println(stk.isEmpty());
    }
}
