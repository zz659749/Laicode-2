package round1;

import java.util.Arrays;

public class TestMerge {
	public static void main (String[] args) {
		MergeSort solution = new MergeSort();
		int[] array = null;
		solution.mergeSort(array);
		System.out.println(Arrays.toString(array));
		int[] array1 = {1,4,3,2};
		solution.mergeSort(array1);
		System.out.println(Arrays.toString(array1));
		int[] array2 = {5};
		solution.mergeSort(array2);
		System.out.println(Arrays.toString(array2));
		int[] array3 = {-1,-4,4,-5};
		solution.mergeSort(array3);
		System.out.println(Arrays.toString(array3));
		int[] array4 = {6,6,6,6};
		solution.mergeSort(array4);
		System.out.println(Arrays.toString(array4));
	}
}
