package testPackage;

import java.util.Scanner;

public class GrayCodeSeq {
	
	public static void gray(String prefix, int n){
		if(n==0){
			System.out.println(prefix);
		}
		else{
			gray(prefix + "1", n-1);
			yarg(prefix + "0", n-1);
		}
	}
	
	public static void yarg(String prefix, int n) {
		// TODO Auto-generated method stub
		if(n==0){
			System.out.println(prefix);
		}
		else{
			gray(prefix + "0", n-1);
			yarg(prefix + "1", n-1);
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Byte b = 2;
		System.out.println(b);
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		GrayCodeSeq scs = new GrayCodeSeq();
		scs.gray("", n);
	}

}