import java.util.*;
import java.lang.*;
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
	public void printList()
	{
		Node ptr=head;
		while(ptr.next!=null)
		{
			ptr=ptr.next;
		}
		System.out.println(ptr);
	}
	public static void main(String ar[])
	{
		Linked_List list=new Linked_List();
		list.head=new Node(12);
		Node s=new Node(24);
		Node t=new Node(36);
		list.head.next=s;
		s.next=t;
		list .printList();
	}
}
	