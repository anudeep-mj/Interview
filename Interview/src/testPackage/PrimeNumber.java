package testPackage;

import java.util.Scanner;

public class PrimeNumber {
	private static final Boolean Bool = null;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number:");
		int num = sc.nextInt();
		if(num<2)
		{
			System.out.println("not possible");
			System.exit(0);
		}
		boolean x = isPrime(num);
		System.out.println(x);
	}
	
	
	public static boolean isPrime(int number)
	{
		int numSqrt = (int) Math.sqrt(number);
		for(int i = 2; i <= numSqrt; i++)
		{
			if(number % i == 0)
			{
				return false;
			}
		}
		return true;
	}
}
