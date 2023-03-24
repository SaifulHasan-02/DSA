package Array;

import java.util.Stack;

public class QueueUsingTwoStack {
    Stack<Integer> stk1 = new Stack<>();
    Stack<Integer> stk2 = new Stack<>();

    void add(int x){

        while (!stk1.isEmpty()){
            stk2.add(stk1.pop());
        }
        stk1.add(x);
        while (!stk2.isEmpty()){
            stk1.add(stk2.pop());
        }
        
    }
    int remove(){
        if(stk1.isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        return stk1.pop();
    }
    int top(){
        if(stk1.isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        return stk1.peek();
    }
    boolean isEmpty(){
        return stk1.isEmpty();
    }

    public static void main(String[] args) {
        QueueUsingTwoStack q = new QueueUsingTwoStack();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        System.out.println(q.top());
        System.out.println(q.remove());
        System.out.println(q.top());
        System.out.println(q.isEmpty());
    }
}
