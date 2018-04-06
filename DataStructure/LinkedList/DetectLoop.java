//Detect the loop is present inside the given Linked List or not
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
	void detectLoop()
	{
		int c=0;
		Node fast_ptr=head,slow_ptr=head;
		while(fast_ptr!=null && slow_ptr!=null  && fast_ptr.next!=null)
		{
			
			fast_ptr=fast_ptr.next.next;
			slow_ptr=slow_ptr.next;
			if(fast_ptr==slow_ptr)
			{
				c=1;
				break;
			}
		}
		if(c==1)
			System.out.println("loop present");
		else
			System.out.println("loop is not present");
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
		llist.push(15);
		llist.push(23);
		llist.push(7);
		llist.push(8);
		System.out.println("Original list:");
		llist.printList();
		System.out.println();
		llist.detectLoop();
		
	}
}