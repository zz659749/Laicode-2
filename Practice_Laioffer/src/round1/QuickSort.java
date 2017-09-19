package round1;

public class QuickSort {
	public int[] quickSort(int[] array) {
		if (array==null) {
			return array;
		}
		quickSort(array,0,array.length-1);
		return array;
	}

	private void quickSort(int[] array, int left, int right) {
		// TODO Auto-generated method stub
		if (left>=right) {
			return;
		}
			int pivotPos = partition(array,left,right);
			quickSort(array,left,pivotPos-1);
			quickSort(array,pivotPos+1,right);
		
	}

	private int partition(int[] array, int left, int right) {
		// TODO Auto-generated method stub
		int pivotIndex = pivotIndex (left,right); 
		int pivot=array[pivotIndex];
		//swap pivot to the most right and compare the rest in the array
		//then change it back later after all the rest sorted upon pivot
		swap (array,pivotIndex,right);
		int leftBound = left;
		int rightBound =right-1;//cuz array[right] is pivot
		while (leftBound<=rightBound) {
			if (array[leftBound]>=pivot) {
				swap(array,leftBound,rightBound--);
			}else {
				leftBound++;
			}
		}
		swap(array,leftBound,right);
		return leftBound;
		
	}

	private int pivotIndex(int left, int right) {
		// TODO Auto-generated method stub
		return left+(int)(Math.random()*(right-left+1));
	}
	private void swap(int[] array, int left, int right) {
		// TODO Auto-generated method stub
		int tmp = array[left];
		array[left]=array[right];
		array[right]=tmp;
		
	}
}
