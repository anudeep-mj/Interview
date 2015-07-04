package testPackage;

public class BinSrchTreeImplementations<Key extends Comparable<Key>, Value> {
	private Node root;
	
	private class Node{
		private Key key;
		private Value val;
		private Node left, right;
		private int N;
		public Node(Key key, Value val, int N)
		{
			this.key = key;
			this.val = val;
			this.N = N;
		}
	}
	public boolean isEmpty()
	{
		return size(root)==0;
	}
	public int size(Node x){
		if(x == null) return 0;
		else
			return x.N;
	}
	
	// to check for key
	
	public boolean contains(Key key)
	{
		return get(key)!= null;
	}
	public Value get(Key key) {
		// TODO Auto-generated method stub
		return get(root, key);
	}
	private Value get(Node root2, Key key) {
		// TODO Auto-generated method stub
		if (root2 == null) return null;
		int cmp = key.compareTo(root2.key);
		if(cmp < 0)
			return get(root2.left, key);
		if(cmp > 0)
			return get(root2.right, key);
		else
			return root2.val;
	}
	
	//inserting a key value pair
	
	public void put(Key key, Value val){
		if(val == null){
			delete(key);
			return null;
			assert check();
		}
	}
	
	private Node put(Node x, Key key, Value val){
		if(x == null) return new Node(key, val, 1);
		int cmp = key.compareTo(x.key);
		if(cmp < 0) x.left = put(x.val, key, val);
		if(cmp > 0) x.right = put(x.val, key, val);
		else
			x.val = val;
		x.N = 1 + size(x.left)+size(x.right);
		return x;
	}
	
	// delete
	
	public void deleteMin() {
		if(isEmpty()) throw new NoSuchElementException("symb tab overflow");
		root = deleteMin(root);
		assert check();
	}
	
	private Node deleteMin(Node x){
		if(x.left == null)
			return x.right;
		x.left = deleteMin(x.left);
		x.N = size(x.left) + size(x.right) + 1;
		return x;
	}
	public void deleteMax() {
        if (isEmpty()) throw new NoSuchElementException("Symbol table underflow");
        root = deleteMax(root);
        assert check();
    }

    private Node deleteMax(Node x) {
        if (x.right == null) return x.left;
        x.right = deleteMax(x.right);
        x.N = size(x.left) + size(x.right) + 1;
        return x;
    }

    public void delete(Key key) {
        root = delete(root, key);
        assert check();
    }

    private Node delete(Node x, Key key) {
        if (x == null) return null;
        int cmp = key.compareTo(x.key);
        if      (cmp < 0) x.left  = delete(x.left,  key);
        else if (cmp > 0) x.right = delete(x.right, key);
        else { 
            if (x.right == null) return x.left;
            if (x.left  == null) return x.right;
            Node t = x;
            x = min(t.right);
            x.right = deleteMin(t.right);
            x.left = t.left;
        } 
        x.N = size(x.left) + size(x.right) + 1;
        return x;
    } 
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
