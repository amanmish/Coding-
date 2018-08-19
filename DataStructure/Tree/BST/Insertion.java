import java.util.*;
class BST
{
	class Node
	{
		Node right,left;
		int key;
		Node(int d)
		{
			key=d;
			left=right=null;
		}
	}
	Node root;
	BST()
	{
		root=null;
	}
	void insert(int d)
	{
		root=insertRec(root,d);
	}
	Node insertRec(Node root,int d)
	{
		if(root==null){
			root=new Node(d);
			return root;
		}
		if(d<root.key)
			root.left=insertRec(root.left,d);
		else if(d>root.key)
			root.right=insertRec(root.right,d);
		return root;
	}
	
	void inorder(Node root)
	{
		if(root!=null)
		{
			inorder(root.left);
			System.out.println(root.key);
			inorder(root.right);
		}
	}
	public static void main(String  args[])
	{
		BST tree=new BST();
		tree.insert(10);
		tree.insert(20);
		tree.insert(5);
		tree.insert(7);
		tree.insert(22);
		tree.inorder(tree.root);
	}
}