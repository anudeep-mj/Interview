package testPackage;

public class QuickSort {
	void QuickSort(int arr[], int left, int right)
	{
		int index = partition(arr, left, right);
		if(left < index-1)
			QuickSort(arr, left, index-1);
		if(index < right)
			QuickSort(arr, index, right);
	}
	private int partition(int[] arr, int left, int right) {
		// TODO Auto-generated method stub
		int i = left, j = right;
		int temp;
		int pivot = arr[(left+right)/2];
		while(i <= j)
		{
			while(arr[i] < pivot)
				i++;
			while(arr[j] > pivot)
				j--;
			if(i <= j) {
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
		}
		return i;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}



//Algorithm
//The divide-and-conquer strategy is used in quicksort. Below the recursion step is described:
//
//    Choose a pivot value. 
//    We take the value of the middle element as pivot value, but it can be any value, which is in range of sorted values, even if it doesn't present in the array.
//    Partition. 
//    Rearrange elements in such a way, that all elements which are lesser than the pivot go to the left part of the array and all elements greater than the pivot, go to the right part of the array. Values equal to the pivot can stay in any part of the array. Notice, that array may be divided in non-equal parts.
//    Sort both parts. 
//    Apply quicksort algorithm recursively to the left and the right parts.