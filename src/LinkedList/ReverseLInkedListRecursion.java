package LinkedList;

import java.util.LinkedList;

public class ReverseLInkedListRecursion {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        System.out.println(list);
        reverseLL(list);
    }
    public static void reverseLL(LinkedList list){
        LinkedList temp = list;
        while (list != null){
            System.out.println(list);
        }
    }
}
