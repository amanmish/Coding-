//Remove Duplicate element from an Unsorted LinkedList
import java.util.*;
class Linked_List
{
	Node head;
	class Node
	{
		int data;
		Node next;
		Node(int d)	
		{
			data=d;
			next=null;
		}
	}
	void removeDuplicate()
	{
		HashSet<Integer> hs=new HashSet<Integer>();
		Node curr=head;
		Node prev=null;
		while(curr!=null)
		{
			int value=curr.data;
			if(hs.contains(value))
				prev.next=curr.next;
			else
			{
				hs.add(value);
				prev=curr;
			}
			curr=curr.next;
		}
	}
	void push(int d)
	{
		Node new_node=new Node(d);
		new_node.next=head;
		head=new_node;
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
		llist.push(11);
		llist.push(11);
		llist.push(7);
		llist.push(8);
		llist.push(11);
		llist.push(8);
		llist.push(5);
		System.out.println("Original list:");
		llist.printList();
		System.out.println();
		System.out.println("After removing duplicate value");
		llist.removeDuplicate();
		llist.printList();
		
	}
}