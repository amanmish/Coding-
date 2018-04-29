import java.util.*;
class stack
{
	static class Queue
	{
		Stack<Integer> stack1;
		Stack<Integer> stack2;
	}
	static void push(Stack<Integer> temp, int k)
	{
		temp.push(k);
	}
	static int pop(Stack<Integer> temp)
	{	
		if(temp.isEmpty())
		{
			System.out.println("underflow");
		}
		return temp.pop();
	}
	static void enq(Queue q,int x)
	{
		push(q.stack1,x);
	}
	static int deQueue(Queue q)
	{
		int x;
		if(q.stack1.isEmpty() && q.stack2.isEmpty())
		{
			System.out.println("q is empty");
			System.exit(0);
		}
		if(q.stack2.isEmpty())
		{
			while(!q.stack1.isEmpty())
			{
				x=pop(q.stack1);
				push(q.stack2,x);
			}
		}
		x=pop(q.stack2);
		return x;
	}
	public static void main(String ar[])
	{
		Queue q=new Queue();
		q.stack1=new Stack<Integer>();
		q.stack2=new Stack<Integer>();
		enq(q,1);
		enq(q,2);
		enq(q,3);
		enq(q,4);
		System.out.print(deQueue(q)+" ");
		System.out.print(deQueue(q)+" ");
		System.out.print(deQueue(q)+" ");
		System.out.println(deQueue(q)+" ");
		
	}
}