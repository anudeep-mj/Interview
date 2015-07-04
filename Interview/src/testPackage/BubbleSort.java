package testPackage;

public class BubbleSort {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] aray = new int[10];
		aray[1] = 4;
		aray[2] = 9;
		aray[3] = 3;
		aray[4] = 1;
		aray[5] = 5;
	}
	
	void bubbleSort(int ar[])
	{
		for(int i =(ar.length - 1); i >= 0; i--)
		{
			for(int j=1; j <= i; j++)
			{
				if(ar[j-1] > ar[j])
				{
					int temp = ar[j-1];
					ar[j-1] = ar[j];
					ar[j] = temp;
				}
			}
		}
	}
}
