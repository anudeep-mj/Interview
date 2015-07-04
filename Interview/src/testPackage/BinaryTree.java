package testPackage;

public class BinaryTree {
	private Node root;
	
	private class Node{
		Node left;
		Node right;
		int data;
		
		Node(int newData){
			left = null;
			right = null;
			data = newData;
		}
	}

//when creating a binary tree remember to set root = null
	public void BinaryTree(){
		root = null;
	}
	
	public boolean lookup(int data){
		return(lookup(root, data));
	}
	
	public boolean lookup(Node node, int data){
		if(node==null){
			return false;
		}
		if(node.data == data){
			return true;
		}
		if(node.data<data){
			return(lookup(node.right, data));
		}
		else
			return(lookup(node.left, data));
	}
	
	public void insert(int data){
		root = insert(root, data);
	}
	
	public Node insert(Node node, int data){
		if(node == null){
			node = new Node(data);
		}
		else{
			if(node.data<data)
				insert(node.right, data);
			else
				insert(node.left, data);
		}
		return node;
	}
	
	public void build123(){
		root = new Node(2);
		Node lchild = new Node(1);
		Node rchild = new Node(3);
		root.left= lchild;
		root.right= rchild;
	}
	
	public int getSize(Node node){
		return(size(root));
	}
	public int size(Node node){
		if(node == null)
			return 0;
		else
			return(size(node.left) + 1 + size(node.right));
	}
	
	public int MaxDepth(){
		return MaxDepth(root);
	}
	
	public int MaxDepth(Node node){
		if(root == null){
			return 0;
		}
		else{
			int ldepth = MaxDepth(node.left);
			int rdepth = MaxDepth(node.right);
			return(Math.max(ldepth, rdepth)+1);
		}
	}
	
	public int MinVal(){
		return MinVal(root);
	}
	
	public int MinVal(Node node){
		Node current = node;
		while(current.left != null)
			{current = current.left;}
		return current.data;
	}
	
	public int MaxVal(){
		return MaxVal(root);
	}
	
	public int MaxVal(Node node){
		Node current = node;
		while(current.right != null){
			current = current.right;
		}
		return current.data;
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree tree = new BinaryTree();
		tree.build123();
	}

}
