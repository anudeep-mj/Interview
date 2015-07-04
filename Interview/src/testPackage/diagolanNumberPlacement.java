
package testPackage;

import java.util.Scanner;

public class diagolanNumberPlacement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     Scanner sc = new Scanner(System.in);
	     int N = sc.nextInt();
	     int  start = 1;
	     int  cur = 0;
	     for(int i=0; i + start <=N; i++){
	         start += i;
	         cur = start;
	         for (int j = i; j+cur <= N; j++){
	             cur = cur+j;
	             System.out.println(cur);
	         }
	         System.out.println("\n");
	     }
	}

}
