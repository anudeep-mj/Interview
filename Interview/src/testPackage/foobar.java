package testPackage;

import java.util.Scanner;
import java.io.Console;
import java.lang.*;


public class foobar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner in = new Scanner(System.in);
//		int input = in.nextInt();
	    String numberstr;
	    numberstr = null;
		for(int i=1;i<=100;i++)
		{
			numberstr = Integer.toString(i);
			if(i % 3 == 0)
		    {
		        System.out.println("foo");
		        numberstr = "";
		    }
		    if(i % 7 == 0)
		    {
		        System.out.println("bar");
		        numberstr = "";
		    }
		    System.out.println(numberstr);
		}
		}
	
}
