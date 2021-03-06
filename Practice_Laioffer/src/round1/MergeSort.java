//Given an array of integers, sort the elements in the array in ascending order. The merge sort algorithm should be used to solve this problem.
//
//Examples
//
//{1} is sorted to {1}
//{1, 2, 3} is sorted to {1, 2, 3}
//{3, 2, 1} is sorted to {1, 2, 3}
//{4, 2, -3, 6, 1} is sorted to {-3, 1, 2, 4, 6}
//Corner Cases
//
//What if the given array is null? In this case, we do not need to do anything.
//What if the given array is of length zero? In this case, we do not need to do anything.
package round1;

public class MergeSort {
	public int[] mergeSort (int[] array) {
		if (array == null){ //无所谓|| array.length == 1) {
			return array;
		}
		int[] helper=new int[array.length];
		mergeSort(array,helper,0,array.length-1);
		return array;
	}

	private void mergeSort(int[] array, int[] helper, int left, int right) {
		// TODO Auto-generated method stub
		if (left>=right) {
			return;
		}
		int mid = left + (right-left)/2;
		mergeSort(array,helper,left,mid);
		mergeSort(array,helper,mid+1,right);
		merge(array,helper,left,mid,right);
		
	}

	private void merge(int[] array, int[] helper, int left, int mid, int right) {
		// TODO Auto-generated method stub
		for (int i=left;i<=right;i++) {
			helper[i]=array[i];
		}
		//copy array to helper
		int leftBound=left;
		int rightBound = mid+1;
		while (leftBound<=mid && rightBound <= right) {
			if (helper[leftBound]>helper[rightBound]) {
				array[left++]=helper[rightBound++];
			}else {
				array[left++]=helper[leftBound++];
			}
		}
		while (leftBound<=mid) {
			array[left++]=helper[leftBound++];
		}
		//while(rightBound) is not needed because array[left] is equal to helper[rightBound] and rest
		
	}
}
