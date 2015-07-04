package testPackage;
import java.util.*;
import java.io.*;


public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in1 = new Scanner(System.in);
		Scanner in = new Scanner(System.in);
		System.out.println("enter the array length");
		int length = in1.nextInt();
		int[] leng = new int[length];
		for(int i = 0; i<length; i++)
		{
			int num = in.nextInt();
			System.out.println(num);
			leng[i] = num;
		}
		Arrays.sort(leng);
		System.out.println(leng[leng.length-1]);
	}

}
