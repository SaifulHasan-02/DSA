package LinkedList;

import java.util.*;

class LinkedListSelf{
	public static void main(String[] args){
		LinkedListCode obj = new LinkedListCode();
//		LinkedListCode obj2 = new LinkedListCode();
		obj.insertFirst(3);
		obj.insertFirst(2);
		obj.insertFirst(1);
		obj.insertFirst(1);
		obj.insertFirst(1);
		//obj.insertFirst(70);
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

		//System.out.println(obj.isLoop());
		//obj.reverseRec(obj.head);
		//System.out.println("Middle element: "+obj.middleEle());
		//System.out.println(obj.reverseStack());
//		obj.reverseRec2(obj.head);
//		obj.display();
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
	}
}
