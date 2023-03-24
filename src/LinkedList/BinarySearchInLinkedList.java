package LinkedList;
class Node{
    int val ;
    Node next ;
    Node head;
    int size;
    Node tail;
    Node(){
        this.size = 0;
    }
    Node(int val){
        this.val = val;
        next = null;
    }
    void insertFirst(int x){
        Node node = new Node(x);
        node.next = head;
        head = node;
        size++;

        if(head == null){
            tail = head;
        }

    }
    void insertLast(int val){
        Node node = new Node(val);
        if(head == null){
            insertFirst(val);
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = node;
        tail = node;
        size++;
    }
    void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
        System.out.println("end");
    }
    int binarySearch(Node head,int target){
        if(head == null){
            return -1;
        }
        /*
        //you not maintain tail pointer then use getTail
        Node last = getTail(head);
         */
        Node last = tail;
        Node start = head;
        while(start != null && ( last == null || start.val <= last.val)){
            Node mid = getMid(start,last);
            if(mid.val == target){
                return mid.val;
            }
            else if(mid.val > target){
                last = mid;
            }
            else{
                start = mid.next;
            }
        }
        return -1;
    }
    public int bSearch(Node head,int target){
        Node start = head;
        Node last = null;

        do{
            Node mid = getMid(head,last);

            if(mid == null) return -1;

            else if(mid.val == target){
                return mid.val;
            } else if (mid.val < target) {
                start = mid.next;
            }
            else{
                last = mid;
            }
        } while (last == null || start != last);
        return -1;
    }

    Node getMid(Node head,Node last){
        Node f,s;
        f = s = head;
        while (f != last && f.next != last) {
            f = f.next.next;
            s = s.next;
        }

        return s;
    }
    public static Node getTail(Node head){
        Node temp = head;
        while (temp.next!= null){
            temp = temp.next;
        }
        return temp;
    }


}


public class BinarySearchInLinkedList {
    public static void main(String[] args) {
        Node ll = new Node();

        ll.insertFirst(4);

        ll.insertFirst(3);

        ll.insertFirst(2);
        ll.insertFirst(1);
        ll.insertLast(5);
        //ll.insertLast(5);
        System.out.println(ll.size);
        ll.display();
        System.out.println(ll.binarySearch(ll.head,1));
        System.out.println(ll.binarySearch(ll.head,2));
        System.out.println(ll.binarySearch(ll.head,3));
        System.out.println(ll.binarySearch(ll.head,4));
        System.out.println(ll.binarySearch(ll.head,5));
        System.out.println(ll.binarySearch(ll.head,6));
    }
}
