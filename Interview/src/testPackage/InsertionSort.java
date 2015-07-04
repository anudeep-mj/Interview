package testPackage;

import java.util.Arrays;

public class InsertionSort {
	InsertionSort(int[] arr)
	{
		for(int i = 1; i < arr.length; i++)
		{
			int valueToSort = arr[i];
			int j = i;
			while(j>0 && arr[j-1] > valueToSort)
			{
				arr[j] = arr[j-1];
				j--;
			}
			arr[j] = valueToSort;
		}
	}
	
	public static void printArray(int[] B) {
        System.out.println(Arrays.toString(B));
    }
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
