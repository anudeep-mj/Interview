package testPackage;

import java.util.Scanner;

public class binary {
	private static final int KEY_NOT_FOUND = 0;
	public int binarySearch(int imax, int imin, int key, int A[]){
		if(imax<imin)
		{
			return KEY_NOT_FOUND;
		}
		else
		{
			int imid = (imax + imin)/2;
			if(A[imid] > key)
			{
				return binarySearch(imid-1, imin, key, A);
			}
			if(A[imid] < key)
			{
				return binarySearch(imax, imid+1, key, A);
			}
			else
				return imid;
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int length = in.nextInt();
		int[] arrayRequired = new int[length];
		
	}

}
