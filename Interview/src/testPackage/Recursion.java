package testPackage;

import java.util.ArrayList;
import java.util.List;

public class Recursion {
	public void main()
	{
		List list1 = new ArrayList();
		List list2 = new ArrayList();
		list1.add("spam");
		list1.add(list2);
		list1 = ['a string', ['a','b','c'], 'spam', ['eggs']];
		
	}
	
	void permute(String strng)
	{
		int length = strng.length();
		boolean[] used = new boolean[length];
		StringBuffer opstring = new StringBuffer();
		char[] in = strng.toCharArray();
		dopermute(in, opstring, used, length, 0);
	}

	private void dopermute(char[] in, StringBuffer opstring, boolean[] used,
			int length, int i) {
		// TODO Auto-generated method stub
		
	}
}
