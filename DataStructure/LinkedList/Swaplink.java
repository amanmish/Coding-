//Swap the two Link without swapping the data
import java.util.*;
class Linked_List
{
	Node head;
	static class Node
	{
		int data;
		Node next;
		Node(int d)
		{
			data=d;
			next=null;
		}
	}
	
	void push(int d)
	{
		Node new_node=new Node(d);
		new_node.next=head;
		head=new_node;
	}
	void swap(int x,int y)
	{
		if(x==y)
			return;
		
		Node currFirst=head,prevFirst=null;
		Node currSec=head,prevSec=null;
		
		while(currFirst!=null && currFirst.data!=x)
		{
			prevFirst=currFirst;
			currFirst=currFirst.next;
		}
		while(currSec!=null && currSec.data!=y)
		{
			prevSec=currSec;
			currSec=currSec.next;
		}
		
		if(prevFirst!=null)
				prevFirst.next=currSec;
		else
			head=currSec;
		
		if(prevSec!=null)
			prevSec.next=currFirst;
		else
			head=currFirst;
		
		//Swap
		Node temp=currFirst.next;
		currFirst.next=currSec.next;
		currSec.next=temp;
	}
	void printList()
	{
		Node ptr=head;
		while(ptr!=null)
		{
			System.out.print(ptr.data+" ");
			ptr=ptr.next;
		}
	}
	public static void main(String ar[])
	{
		Linked_List llist=new Linked_List();
		llist.push(5);
		llist.push(10);
		llist.push(15);
		llist.push(20);
		llist.push(25);
		llist.push(30);
		llist.push(35);
		llist.push(40);
		System.out.println("Before swapping link is: ");
		llist.printList();
		System.out.println();
		System.out.println("After swapping 15 & 30 new list is: ");
		llist.swap(15,30);
		llist.printList();
		
	}
	
}