package testPackage;

import java.util.Scanner;

public class BitManip {
	static void check(int x, int y)
	{
		int no = x ^ y;
		int i;
	    for (i = 0; no > 0; ++i) {
	      no &= no - 1;
	    }
	    System.out.println(i);
	}
	
	public static int greyimage(byte b1, byte b2){
		if(b1 == b2)	//check if equal
			return 0;
//		byte x = (byte)(b1 ^ b2);	//xor them
		int y = (b1 ^ b2) & 0xff;
		if((y & (y-1)) == 0)	//-1 it and & it and check for 0
			return 1;
		else
			return 0;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
//		System.out.println("Enter 2 integers");
//	    int number = in.nextInt();
//	    int number2 = in.nextInt();
//	    check(number, number2);
		
	    byte b1 = in.nextByte();
	    byte b2 = in.nextByte();
	    int op = greyimage(b1,b2);
	    System.out.println(op);
	}

}
