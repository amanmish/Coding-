//Java program to implement a stack that support getMin() in O(1)time and O(1)extra space
import java.util.*;
class stack
{
	Stack<Integer> s;
	int minEle;
	stack()
	{
		 s=new Stack<Integer>();
	}
	void getMin()
	{
		if(s.isEmpty())
		{
			System.out.println("stack is empty");
			return ;
		}
		System.out.println("Minimum element is: "+minEle); 
	}
	void peek()
	{
		if(s.isEmpty())
		{
			System.out.println("stack is empty");
			return ;
		}
		int t=s.peek();
		if(t<minEle)
			System.out.println("Top element is: "+minEle);
		else
			System.out.println("Top element is: "+t);
	}
	void push(int x)
	{
		int t;
		if(s.isEmpty())
		{
			minEle=x;
			s.push(x);
			System.out.println("Number inserted is: "+x);
			return;
		}
		if(x<minEle)
		{
			t=2*x-minEle;
			minEle=x;
			s.push(t);
		}
		else
			s.push(x);
		System.out.println("Number inserted is: "+x);
	}
	void pop()
	{
		if(s.isEmpty())
		{
			System.out.println("Stack is emppty");
			return;
		}
		int t=s.pop();
		System.out.print("The top most element removed is: ");
		if(t<minEle)
		{
			System.out.println(minEle);
			minEle=2*minEle-t;
		}
		else
			System.out.println(t);
	}
	public static void main(String[] args)
    {
        stack s = new stack();
        s.push(3);
        s.push(5);
        s.getMin();
        s.push(2);
        s.push(1);
        s.getMin();
        s.pop();
        s.getMin();
        s.pop();
        s.peek();
    }
}