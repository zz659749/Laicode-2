package round2;

public class BinarySearchFirstOcc {
	public int firstOccurrence(int[] array,int target){
		if (array==null || array.length==0) {
			return -1;
		}
		int left=0;
		int right = array.length-1;
		while(left<=right) {
			int mid=left+(right-left)/2;
			if(array[mid]>=target) {
				right=mid;
				//优先缩小右边界 这样不会让第一个漏出去
				//keep doing until the mid is either 
				//at right most or leftmost
			}else {
				left=mid;
			}
		}
		if (array[left]==target) {//先判断left 确保是第一个
			return left;
		}else if (array[right]==target){
			return right;
		}
		return -1;
	}
}
