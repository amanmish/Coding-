//Level order traversal
import java.util.*;
class BT
{
	class Node
	{
		Node right,left;
		int data;
		Node(int d)
		{
			data=d;
			left=right=null;
		}
	}
	Node root;
	void lot()	
	{
		Queue<Node> que=new LinkedList<Node>();
		que.add(root);
		while(!que.isEmpty())
		{
			Node temp=que.poll();
			System.out.println(temp.data);
			if(temp.left!=null)
				que.add(temp.left);
			if(temp.right!=null)
				que.add(temp.right);
		}
	}
