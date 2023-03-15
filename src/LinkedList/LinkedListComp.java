package LinkedList;

import java.util.*;
class LinkedList{
    public Node head;
    Node tail;
    int size;

    public void insertFirst(int data){
        Node node = new Node(data);
        node.next = head;
        head = node;
        if(tail == null)
            tail = head;
        size++;
    }
    public void insertPost(int index,int data){
        if(index == 0){
            insertFirst(data);
            return;
        }
        else if(index == size){
            insertLast(data);
            return;
        }

        Node temp = head;
        for(int i =1 ;i<index;i++){
            temp = temp.next;
        }
		/*
		Node node = new Node(data,temp.next);
		temp.next = node;
		size++;
		*/
        Node node = new Node(data);
        node.next = temp.next;
        temp.next = node;
        size++;

    }
    public void insertLast(int data){
        if(head == null){
            insertFirst(data);
            return;
        }
		/*
		Node node = new Node(data);
		tail.next = node;
		tail = node;
		size++;
        */

        Node node = new Node(data);
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = node;
        tail = temp;
        //tail.next = head.next; //this is used for only checking the isLoop() method
        size++;
    }
    public int deleteFirst(){

        if(head == null){
            System.out.println("Nothing to Delete");
        }

        int val = head.data;
        head = head.next;
        if(head == null)
            tail = null;
        size--;
        return val;
    }
    public int deletePos(int index){
        if(index == 0)
            return deleteFirst();
        else if(index== size-1)
            return deleteLast();
        Node prev = get(index-1);
        int val = prev.next.data;
        prev.next = prev.next.next;
        size--;
        return val;
    }
    public int deleteNFromEnd(int n){
        if(n==size){
            return deleteFirst();
        }
        else if(n == 1)
            return deleteLast();

        int targetNode = size-n+1;
        Node prevNode = get(targetNode-2);
        prevNode.next = prevNode.next.next;
        return prevNode.data;
    }
    public Node get(int index){
        Node temp = head;
        for(int i=0;i<index;i++){
            temp = temp.next;
        }
        return temp;
    }

    public int deleteLast(){
        int val = tail.data;
        Node secondLast = get(size-2);
        secondLast = tail;
        tail.next = null;
        size--;
        return val;
    }
    public Node search(int val){
        if(size == -1)
            return null;
        Node temp = head;
        while(temp != null){
            if(temp.data == val){
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }
    public void reverse(){
        if(head == null){
            return;
        }
        Node currentNode,prevNode,nextNode;
        currentNode = nextNode = head;
        prevNode = null;
        while(currentNode != null){
            nextNode = nextNode.next;
            currentNode.next = prevNode;
            prevNode = currentNode;
            currentNode = nextNode;
        }
        head = prevNode;
    }
    //Reverse List Using Recursion
    public void reverseRec(Node node){
        //Node tail = findTail();
        if(node == tail){
            head = tail;
            return;
        }
        reverseRec(node.next);
        tail.next = node;
        tail = node;
        tail.next = null;
    }
    public  Node findTail(){
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        System.out.println(temp.data);
        return temp;
    }
    public int reverseStack(){
        Stack<Node> stk = new Stack<>();
        while(head != null){
            stk.push(head);
            head = head.next;
        }
        Node tail = head;
        while(!stk.isEmpty()){
            tail.next = stk.peek();
            stk.pop();
            tail = tail.next;
        }
        head = tail;
        return head.data;

    }
    public void display(){
        if(head == null){
            System.out.println("List  not form");
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println("END");
        //displayRec(head);
    }
    public void displayRec(Node head){
        Node temp = head;
        if(temp == null){
            return;
        }
        System.out.print(temp.data+"->");
        //displayRec(temp.next);
    }
    public int countingNode(){
        if(head == null)
            return 0;
        int count = 0;
        while(head != null){
            count++;
            head = head.next;
        }
        return count;
    }
    public int countingNodeRec(Node head){

        if(head == null)
            return 0;
        return 1+countingNodeRec(head.next);
    }

    public int sum(){
        int sum = 0;
        if(head == null){
            return 0;
        }
        while(head != null){
            sum=sum+head.data;
            head =head.next;
        }
        return sum;
    }

    public int sumRec(Node head){
        if(head == null)
            return 0;
        return head.data+sumRec(head.next);

    }
    public boolean isSorted(){
        int max = head.data;
        Node temp = head;
        while(temp.next != null){
            if(temp.next.data>max){
                max = temp.data;
            }
            if(temp.next.data<max)
                return false;
            temp = temp.next;

        }
        return true;
    }
    public void removeDup(){
        Node p = head;
        Node q = head.next;
        if(p == null)
            return;
        while(p.next != null){ //while(q != null)
            if(p.data != q.data){
                p=p.next;
                q=q.next;
            }
            if(p.data == q.data){
                p.next = q.next;
                q = q.next;
            }
        }

    }
    public boolean isLoop(){
        Node p,q;
        p = head;
        q = head.next;
        do{
            p = p.next;
            q = q.next;
            q = q != null ? q.next : null;
        }while( q != null && p != q);
        if(p == q)
            return true;
        else
            return false;
    }
    public static int interSectionPt(Node h1 , Node h2){
        if(h1 == null || h2 == null)
            return -1;
        Node p,q;
        p = h1;
        q = h2;
        while(p != null || q != null){
            if(p.data == q.data){
                return p.data;
            }
            if(p == null && q == null)
                break;
            p = p.next;
            q = q.next;
            if(p == null)
                p = h2;
            if(q == null)
                q = h1;

        }
        return -1;
    }
    public int middleEle(){
        Node p,q;
        p = head;
        q = head.next;
        while(q != null && q.next != null){
            p = p.next;
            q = q.next.next;
        }
        return p.data;
    }
    public int middle2(){
        Node p,q;
        p=q=head;
        while(q.next != null && q.next.next != null){
            p=p.next;
            q=q.next.next;
        }
        return p.data;
    }
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
		/*
		Node(int data, Node next){
			this.data = data;
			this.next = next;
		}
		*/
    }
    public Node swapNodes(Node head, int k){
        if(head == null){
            return head;
        }
        int len = getLength(head);
        Node tempStart = head;
        for (int i = 1; i < k; i++) {
            tempStart = tempStart.next;
        }
        Node tempEnd = head;
        for (int i = 1; i <(len-k+1) ; i++) {
            tempEnd = tempEnd.next;
        }
        swap(tempStart,tempEnd);

        return head;
    }
    public static void swap(Node tempStart,Node tempEnd){
        int temp = tempStart.data;
        tempStart.data = tempEnd.data;
        tempEnd.data = temp;
    }
    public static int getLength(Node head){
        Node temp = head;
        int count = 0;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    }
    //Rotate List Right
    public Node rotateRight(Node head, int k) {
        int n = getLength2(head);
        System.out.println(n);
        Node secondHead = getSecondHead(head,n-k);

        reverse(head,(n-k));
        display();
       // System.out.println("-----------");
        reverse(secondHead,k);
        display();
        //System.out.println("---------------");
        //reverse(head,n);
        display();
        return head;
    }
    public Node getSecondHead(Node head,int m){
        Node temp = head;
        for(int i=0;i<m;i++){
            temp=temp.next;
        }
        return temp;
    }
    public  int getLength2(Node head){
        int count = 0;
        while(head != null){
            count++;
            head = head.next;
        }
        return count;
    }
    public void reverse(Node head,int m){
        Node prev = null;
        Node currNode = head;
        Node NextNode = head;
        for(int i = 0; i< m;i++){
            NextNode = NextNode.next;
            currNode.next = prev;
            prev = currNode;
            currNode = NextNode;
        }
    }
    //Rotation of LinkedList
    public Node rotateRight2(Node head, int pos){
        int n = getLength(head);
       reverse(head,1,n-pos);
       /*
       Node head2 = reverse(head1,n-pos+1,n);
        display();
       Node head3 = reverse(head2,1,n);

        */
        return head;
    }
    public static void reverse(Node head,int left,int right){
        if(left == right){
            return;
        }
        //skip the 1st left-1 node
        Node prev = null;
        Node current = head;

        for (int i = 0;current != null && i < left - 1; i++) {
            prev = current;
            current = current.next;
        }

         /*
        int count = 0;
        while(count<left-1){
            prev = current;
            current = current.next;
            count++;
        }

          */
        Node last = prev;
        Node newEnd = current;
        //reverse the node between left and right
        Node NextNode = current;

        for (int i = 0; current != null && i < right-left+1; i++) {
            NextNode = NextNode.next;
            current.next = prev;
            prev = current;
            current = NextNode;
        }

         /*
        int count2 = 0;
        while (count2 < right-left+1){
            NextNode = NextNode.next;
            current.next = prev;
            prev = current;
            current = NextNode;
            count2++;
        }

          */
        if(last != null){
            last.next = prev;
        }else{
            head = prev;
        }
        newEnd.next = current;

    }
    public int binarySearch(Node head,int target){
        Node start = head;
        Node end = null;

        do{
            Node mid = getMid(start,end);
            if (mid.data == target) {
                return mid.data;
            } else if (mid.data < target) {
                start = mid.next;

            } else {
                end = mid;
            }
        }while(start != end);
        return -1;
    }
    public Node getMid(Node head,Node end){
        if(head == null){
            return null;
        }
        Node slow = head;
        Node fast = head;
        while(fast != end && fast.next != end){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    public int binary(Node head, int target){
        if(head == null){
            return -1;
        }
        else if(head.next == null){
            if(head.data == target){
                return target;
            }
            return -1;
        }
        Node slow = head, fast = head.next;
        while (fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow.next;
        slow.next = null;
        if(mid.data == target){
            return target;
        }
        else if(mid.data > target){
            return binary(head,target);
        }
        return binary(mid.next, target);
    }

}
class LinkedListComp{
    public static void main(String[] args){
        LinkedList obj = new LinkedList();
        LinkedList obj2 = new LinkedList();
        obj.insertFirst(120);
        obj.insertFirst(14);
//        obj.insertFirst(10);
//        obj.insertFirst(7);
//        obj.insertFirst(5);
//        obj.insertFirst(3);
		/*
		obj.insertFirst(150);
		obj.insertFirst(18);
		obj.insertFirst(20);
		obj.insertFirst(25);
		obj.insertFirst(30);
		obj.insertFirst(35);

		obj2.insertFirst(1);
		obj2.insertFirst(2);
		obj2.insertFirst(3);
		obj2.insertFirst(15);
		obj2.insertFirst(12);
		obj2.insertFirst(17);
		obj2.insertFirst(11);
		//obj.insertLast(100);
		*/
        obj.display();
        //System.out.println(obj.binarySearch(obj.head,1));
        //System.out.println("Middle element: "+obj.middleEle());
       // System.out.println(obj.reverseStack());
        obj.display();
        //System.out.println("Middle element: "+obj.middle2());
        //obj2.display();
        //System.out.println(LinkedList.interSectionPt(obj.head,obj2.head));
        //obj.insertPost(3,1000);
        //System.out.println(obj.isLoop());
        //obj.removeDup(); //for sorted list
        //obj.reverse();
        //obj.display();
        //System.out.println(obj.countingNodeRec(obj.head));
        //System.out.println(obj.sum());
        //System.out.println(obj.isSorted());
        //System.out.println(obj.sumRec(obj.head));
		/*
		obj.deleteNFromEnd(2);
		obj.display();
		obj.deleteNFromEnd(5);
		obj.display();
		obj.deleteNFromEnd(1);
		obj.display();
		*/
		/*
		obj.insertLast(100);
		obj.insertPost(3,150);
		obj.display();
		System.out.println();
		System.out.println("Size of list = "+obj.size);
		System.out.println("Deleted Item = "+obj.deleteFirst());
		obj.display();
		System.out.println("Size of list = "+obj.size);
		System.out.println("Deleted Item = "+obj.deleteLast());
		obj.display();
		System.out.println("Size of list = "+obj.size);
		System.out.println("Deleted Item = "+obj.deletePos(2));
		obj.display();
		System.out.println("Size of list = "+obj.size);
		System.out.println(obj.search(6).data);
		*/
        System.out.println();
        //obj.swapNodes(obj.head,2);
       // obj.rotateRight(obj.head,2);
        //obj.reverseRec(obj.head);
        //obj.rotateRight2(obj.head,2);
        obj.display();
        System.out.println(obj.binary(obj.head, 12));
    }
}

