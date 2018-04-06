//Reverse the Given Linked List and Print it in reverse order
import java.util.*;
class Linked_List
{
	static Node head;
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
	Node reverse(Node node)
	{
		Node curr=node,prev=null,nn=null;
		while(curr!=null)
		{
			nn=curr.next;
			curr.next=prev;
			prev=curr;
			curr=nn;
		}
		node =prev;
		return node;
	}
	void push(int d)
	{
		Node new_node=new Node(d);
		new_node.next=head;
		head=new_node;
	}
	void printList(Node ptr)
	{
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
		llist.push(11);
		llist.push(15);
		llist.push(23);
		llist.push(7);
		llist.push(8);
		System.out.println("Original list:");
		llist.printList(head);
		System.out.println();
		head=llist.reverse(head);
		System.out.println("After reversing the Linked List:");
		llist.printList(head);
		
	}
}
	