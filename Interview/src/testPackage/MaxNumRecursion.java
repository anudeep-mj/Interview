package testPackage;

public class MaxNumRecursion {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = new int[5];
		A[0] = 3;
		A[1] = 2;
		A[2] = 6;
		A[3] = 1;
		A[4] = 8;
		System.out.println("Max no:" + FindMax(A, 0));		
	}

	private static int FindMax(int[] a, int startIndex) {
		// TODO Auto-generated method stub
		if(startIndex == a.length-1){
			return a[startIndex];
		}
		else
		{
			return Math.max(a[startIndex], FindMax(a, startIndex+1));
		}
	}

}