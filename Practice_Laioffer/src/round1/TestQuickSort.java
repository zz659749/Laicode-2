package round1;

import java.util.Arrays;

public class TestQuickSort {
	public static void main (String[] args) {
		QuickSort solution = new QuickSort();
		int[] array = null;
		solution.quickSort(array);
		System.out.println(Arrays.toString(array));
		int[] array1 = {1,4,3,2};
		solution.quickSort(array1);
		System.out.println(Arrays.toString(array1));
		int[] array2 = {5};
		solution.quickSort(array2);
		System.out.println(Arrays.toString(array2));
		int[] array3 = {-1,-4,4,-5};
		solution.quickSort(array3);
		System.out.println(Arrays.toString(array3));
		int[] array4 = {6,6,6,6};
		solution.quickSort(array4);
		System.out.println(Arrays.toString(array4));
	}
}
