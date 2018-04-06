//To get nth-node from the end in a Linked_List
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
			data=d;;
			next=null;
		}
	}
	void middle()
	{
		Node f_ptr=head,s_ptr=head;
		while(f_ptr!=null && f_ptr.next!=null)
		{
			f_ptr=f_ptr.next;
			f_ptr=f_ptr.next;
			s_ptr=s_ptr.next;
		}
		System.out.println(s_ptr.data);
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
		llist.push(7);
		llist.push(3);
		llist.push(12);
		llist.push(14);
		System.out.println("Linked_list is: ");
		llist.printList();
		System.out.println();
		System.out.println("Middle element is: ");
		llist.middle();
		
	}
}