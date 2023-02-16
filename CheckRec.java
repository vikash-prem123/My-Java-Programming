public class CheckRec{
	public static void main(String[] args) {
		
		Node root=new Node(5);
		Node first=new Node(2);
		Node second=new Node(4);
		Node third=new Node(1);
		Node forth=new Node(3);
		root.left=first;
		first.left=second;
		first.right=third;
		root.right=forth;
		check(root);
		
	}

	static void check(Node root)
	{
		if(root==null)
		return;
		check(root.left);
		check(root.right);
		System.out.print(root.data+" ");
	}
}

class Node{
	int data;
	Node left=null;
	Node right=null;
	public Node(int data) {
		this.data=data;
	}
}
