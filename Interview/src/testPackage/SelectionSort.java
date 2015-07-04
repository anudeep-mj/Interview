package testPackage;

public class SelectionSort {
	int i,j;
	void SelectionSort(int[] ar)
	{
		for(int i = 0; i < ar.length-1; i++)
		{
			int min = i;
			for(j = i+1; j<ar.length; j++)
			{
				if(ar[j] > ar[min])
					min = j;
			}
			int temp = ar[i];
			ar[i] = ar[min];
			ar[min] = temp;
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
