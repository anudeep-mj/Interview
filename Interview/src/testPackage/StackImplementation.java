package testPackage;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackImplementation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st = new Stack<Integer>();
		st.push(1);
		st.push(2);
		int x = st.pop();
		int y = st.pop();
//		st.pop();
		System.out.println(x);
		System.out.println(y);
		Queue q = new LinkedList();
	}

}
