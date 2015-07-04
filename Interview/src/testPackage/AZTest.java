package testPackage;

import java.util.Scanner;

public class AZTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "asdf";
		s1 = s1.replaceAll("[AEIOUaeiou]", "");
		System.out.println(s1);
		
		String s2 = "asdfg";
		String s3 = "dfgas";
		System.out.println(rotate(s2, s3));
		Scanner sc = new Scanner(System.in);
		Byte b1 = sc.nextByte();
		Byte b2 = sc.nextByte();
		int op1 = checkByte(b1, b2);
		System.out.println(op1);
		System.out.println("Input num for gener seq");
		int n = sc.nextInt();
		GenerSeq(n, "");
	}

	private static void GenerSeq(int n, String Prefix) {
		// TODO Auto-generated method stub
		if(n == 0){System.out.println(Prefix);}
		else{
			GenerSeq(n-1, Prefix + "1");
			yarg(n-1, Prefix + "0");
			}
	}

	private static void yarg(int n, String Prefix) {
		// TODO Auto-generated method stub
		if(n == 0){ System.out.println(Prefix);}
		else{
			GenerSeq(n-1, Prefix + "0");
			yarg(n-1, Prefix + "1");
		}
	}

	private static int checkByte(Byte b1, Byte b2) {
		// TODO Auto-generated method stub
		if(b1 == b2)
			return 0;
		int c = (b1 ^ b2) & 0xff;
		if((c & (c-1)) == 0){
			return 1;}
		else
			return 0;
		}

	private static boolean rotate(String s2, String s3) {
		// TODO Auto-generated method stub
		if(s2.length() == s3.length()){
			 if((s2+s2).indexOf(s3) == -1){
				 return false;
			 }
			 else
				 return true;
		}
		return false;
	}

}
