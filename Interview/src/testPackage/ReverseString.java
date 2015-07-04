package testPackage;

import java.util.Scanner;

public class ReverseString {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String orig, reverse = "";
		Scanner in = new Scanner(System.in);
		System.out.println("enter the string req");
		orig = in.nextLine();
		
		stringReverse(orig);
	}

	private static void stringReverse(String orig) {
		// TODO Auto-generated method stub
		String reverse = "";
		int length = orig.length();
		for(int i=length-1; i>=0; i--)
		{
			reverse = reverse + orig.charAt(i);
		}
		System.out.println(reverse);
	}
}
