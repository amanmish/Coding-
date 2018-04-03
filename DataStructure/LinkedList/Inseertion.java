//Insertion at Front in Singly LinkedList

import java.util.*;
import java.lang.*;
class Front_Insertion
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
	public void printList()
	{
		Node ptr=head;
		while(ptr!=null)
		{
			System.out.print(ptr.data+"  ");
			ptr=ptr.next;
		}
	}
	public void insertion()
	{
		Node f=new Node(48);
		f.next=head;
		head=f;
		printList();
	}
	public static void main(String ar[])
	{
		Front_Insertion list=new Front_Insertion();
		list.head=new Node(12);
		Node s=new Node(24);
		Node t=new Node(36);
		list.head.next=s;
		s.next=t;
		System.out.println("before insertion");
		list .printList();
		System.out.println();
		System.out.println("After insertion at front");
		list.insertion();
	}
}
	