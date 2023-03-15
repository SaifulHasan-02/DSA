package LinkedList;

import java.util.*;


class LinkedListCode{
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

    /*
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

     */
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
        Node  fast = head;
        Node slow = head;
        while(fast.next != null && fast.next.next != null ){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow) {
                return true;
            }
        }
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
    //
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
    //Sort the list using mergeSort
    /*
    public  void mergeSort2(Node head){
        int e = getLength(head);
        int s = 0;
        mergeSort(head,s,e);
    }

    public void mergeSort(Node head,int s,int e) {
        if(s<e) {
            int mid = s+(e-s)/2;
            mergeSort(head,s,mid);
            mergeSort(head,mid+1,e);
            merge(head,s,mid,e);
        }

    }
    public void merge(Node head,int s,int m,int e) {
        Node temp = head;
        int[] arr = new int[e];
        int i = s;
        int j = m+1;
        int k = 0;



    }

     */
    public int getLength(Node head){
        int count = 0;
        Node temp = head;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    }
    public  void reverseRec2(Node node){
        if(node == tail){
            head = tail;
            return;
        }
        reverseRec2(node.next);
        tail.next = node;
        tail = node;
        tail.next = null;
    }
    public void reverseRec(Node node){
        if(head == tail){
            head = tail;
            return;
        }
        reverseRec(node.next);
        tail.next = node;
        tail = node;
        tail.next = null;
    }



    public Node swapNodes(Node head, int k) {

        int len = getLength2(head);
        int[] arr = new int[len];
        int i = 0;
        Node temp = head;
        while(temp != null){
            arr[i] = temp.data;
            i++;
            temp = temp.next;
        }
        swap(arr,k,len-k+1);
        /*
        Node temp2 = head;
        for(int j=0;j<arr.length;j++){
            temp2.next = (Node)arr[i];
            temp2 = temp2.next;
        }
        */
        //return temp2.next;


        System.out.println(Arrays.toString(arr));
        return head;
    }
    public static int getLength2(Node head){
        Node temp = head;
        int count = 0;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    }
    public static void swap(int[] arr,int s,int e){
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;

    }




}



