package LinkedList;

class LL{
    private Node head;
    private Node tail;
    private int size;
    //LL(){
    //	this.size = 0;
    //}
    public void inserFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        if(tail==null)
            tail=head;

        size=size+1;
    }

    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.println("END");
    }
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
        //Node(int data,Node next){
        //this.data = data;
        //this.next = next;
        //}
    }

}/*
class LinkedList{
    public static void main(String[] args){
        LL ll = new LL();
        ll.inserFirst(3);
        ll.inserFirst(5);
        ll.inserFirst(7);
        ll.inserFirst(9);
        ll.display();
    }
}*/

