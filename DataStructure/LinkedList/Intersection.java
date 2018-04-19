//Get the intersection point of two linked list
import java.util.*;
class Linked_List
{
	Node head,head1;
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
	int get()
	{
		int c1=getCount(head);
		int c2=getCount(head1);
		if(c1 >c2)
		{
			d=c1-c2;
			return intersection(d,head,head1);
		}
		else
		{
			d=c1-c2;
			return intersection(d1,head1,head);
		}
	}
	int  intersection(int d, Node node1, Node node2)
	{
		int i;
		for(i=0;i<d;i++)
			node1=node1.next;
		while(node1!=null && node2!=null)
		{
			if(node1.data==node2.data)
				return node1.data;
			node1=node1.next;
			node2=node2.next;
		}
		return -1;
	}
	int getCount(Node node)
	{
		Node ptr=node;
		int c=0;
		while(ptr!=null)
		{
			ptr=ptr.next;
			c++;
		}									
		return c;
	}
	void push(int data,Node node)
	{
		Node new_node=new Node(data);
		new_node.next=node;
		node.next=new_node;
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
			
	}