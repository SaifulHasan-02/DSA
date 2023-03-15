package Array;

import java.util.LinkedList;
import java.util.Queue;

public class CustomStackUsingSingleQueue {
        Queue<Integer> q = new LinkedList<>();

        void push(int x){
            q.add(x);

            for (int i = 0; i < q.size()-1; i++) {
                int r = q.remove();
                q.add(r);
            }
        }
        int pop(){
            if(q.size() == 0){
                System.out.println("Stack is empty");
                return -1;
            }
            return q.remove();
        }
        int top(){
            if(q.isEmpty()){
                System.out.println("Stack is Empty");
                return -1;
            }
            return q.peek();

        }
        boolean empty(){
            if(q.isEmpty()){
                System.out.println("Stack is empty");
                return true;
            }
            return false;
        }


    public static void main(String[] args) {
        CustomStackUsingSingleQueue stk = new CustomStackUsingSingleQueue();
        stk.push(1);
        stk.push(2);
        stk.push(3);
        stk.push(4);
        stk.push(5);
        System.out.println(stk.pop());
        System.out.println(stk.pop());
        System.out.println(stk.pop());
        System.out.println(stk.top());
        System.out.println(stk.empty());

        System.out.println(stk.pop());
        System.out.println(stk.pop());
        System.out.println(stk.top());
        System.out.println(stk.empty());


    }
}
