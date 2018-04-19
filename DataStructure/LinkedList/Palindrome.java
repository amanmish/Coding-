//Check whether the given Linked_List is palindrome or not
import java.util.*;
class Linked_List
{
	Node head;
	Node slowptr,fasrptr,secondhalf,prev;
	class Node
	{
		char data;
		Node next;
		Node(char d)	
		{
			data=d;
			next=null;
		}
	}
	boolean palindrome(Node head)
	{
		slowptr=head;			
		fasrptr=head;
		prev=head;
		Node mid=null;
		boolean res=true;
	if(head!=null && head.next!=null)
	{
		while(fasrptr!=null && fasrptr.next!=null)
		{
			fasrptr=fasrptr.next.next;
			prev=slowptr;
			slowptr=slowptr.next;
			
		}
		if(fasrptr!=null)
		{
			mid=slowptr;
			slowptr=slowptr.next;
		}
		prev.next=null;
		secondhalf=slowptr;
		System.out.println(secondhalf.data);
		reverse();
		res=CompareList(head,secondhalf);
		
		reverse();
		if(mid!=null)
		{
			prev.next=mid;
			mid.next=secondhalf;
		}
		else
			prev.next=secondhalf;
	
	}
		return res;
	}
	void reverse()
	{
		Node temp=secondhalf;
		Node next,prev1=null,curr=head;
		while(curr!=null)
		{
			next=curr.next;
			curr.next=prev1;
			prev1=curr;
			curr=next;
		}
	}
	boolean CompareList(Node head1, Node head2)
	{
		Node temp1=head1;
		Node temp2=head2;
		while(temp1!=null && temp2!=null)
		{
			if(temp1.data==temp2.data)
			{
				temp1=temp1.next;
				temp2=temp2.next;
			}
			else
				return false;	
		}
		if(temp1==null && temp2==null)
				return true;
		return false;
	}
	void push(char data)
	{
		Node new_node=new Node(data);
		new_node.next=head;
		head=new_node;
	}
	void printList(Node ptr)
	{
		while(ptr!=null)
		{
			System.out.print(ptr.data+"->");
			ptr=ptr.next;
		}
		System.out.println("null");
	}
	public static void main(String ar[])
	{
		int i;
		Linked_List llist=new Linked_List();
		char str[]={'a','b','a','c','a','b','a'};
		String string=new String(str);
		for(i=0;i<str.length;i++)	
		{
			llist.push(str[i]);
			llist.printList(llist.head);
			if(llist.palindrome(llist.head)!=false)
			{
				System.out.println("It is palindrome");
				System.out.println();
			}
			else
			{
				System.out.println("It is Not a palindrome");
				System.out.println();
			}
		}
		
	}
}