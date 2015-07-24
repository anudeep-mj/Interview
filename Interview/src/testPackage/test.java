package testPackage;
import java.util.*;
import java.io.*;


public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner in1 = new Scanner(System.in);
//		Scanner in = new Scanner(System.in);
//		System.out.println("enter the array length");
//		int length = in1.nextInt();
//		int[] leng = new int[length];
//		for(int i = 0; i<length; i++)
//		{
//			int num = in.nextInt();
//			System.out.println(num);
//			leng[i] = num;
//		}
		int j = 0;
		int[] denominations = { 23, 30, 24, 10, 6, 2, 1 };
		Arrays.sort(denominations);
//		for(j = 0; j < denominations.length ; j++)
//			System.out.println(denominations[j]);
		
//		System.out.println("break");
		for(int i = 0; i < denominations.length / 2; i++)
		{
		    int temp = denominations[i];
		    denominations[i] = denominations[denominations.length-i - 1];
		    denominations[denominations.length - i - 1] = temp;
		}
//		System.out.println("break");
//		for(j = 0; j < denominations.length ; j++)
//			System.out.println(denominations[j]);

	}
	
	public static boolean useLoop(String[] arr, String targetValue) {
		for(String s: arr){
			if(s.equals(1))
				return true;
		}
		return false;
	}
}
