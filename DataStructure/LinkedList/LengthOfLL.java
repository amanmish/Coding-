import java.util.*;
class LengthOfLL
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
	public void push(int d)
	{
		Node new_node=new Node(d);
		new_node.next=head;
		head=new_node;
	}
	public int count(Node node)
	{
		if(node==null)
			return 0;
		else
			return 1+count(node.next);
	}
	
	public int getCount()
	{
		return count(head);
	}
	public static void main(String ar[])
	{
		LengthOfLL len=new LengthOfLL();
		len.push(12);
		len.push(24);
		len.push(3);
		len.push(30);
		len.push(60);
		len.push(10);
		len.push(84);
		int ans=len.getCount();
		System.out.print("Length of given linkedlist is: "+ans); 
		
	}
}
	