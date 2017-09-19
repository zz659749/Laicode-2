package round1;

public class Move0toEnd {
	public int[] moveZero(int[] array) {
		if (array.length<=1) {
			return array;
		}
		int start = 0;
		int end= array.length-1;
		while (start<=end) {
			if (array[start]==0) {
				swap(array,start,end--);
			}else {
				start++;
			}
		}
		return array;
		
	}
	  private void swap (int[] array, int a, int b) {
		    int tmp= array[a];
		    array[a] = array[b];
		    array[b] = tmp;
		  }
}
