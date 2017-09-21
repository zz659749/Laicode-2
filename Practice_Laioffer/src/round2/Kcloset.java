package round2;

public class Kcloset {
	 public int[] kClosest(int[] array, int target, int k) {
		    int[] result = new int[k];
		    if(array.length==0 ||k==0){
		       return result;  
		    }
		    int left = largestSmallest(array,target);
		    int right = left+1;
		    
		    for (int i= 0; i< k ;i++){
		       if (right >= array.length || left >=0 && target - array[left] <= array [right] - target) {
		          result[i] = array[left--];
		    }else{
		       result[i] = array[right++];
		    }
		    }
		    return result;
		   
		  }
	 //先找到最closet的 然后左右+1对比 直到到k或者超出边界
		    
		  private int largestSmallest(int[] array, int target){
		    int left = 0;
		    int right = array.length-1;
		    while (left < right -1){
		      int mid = left + (right-left)/2;
		      if (array[mid]<= target){
		        left=mid;
		      }else{
		        right=mid;
		      }
		    }
		    if (array[right]<=target){ // return the largest smaller or euqal element, so when we compare left and left+1 (right) we compare wont miss any elements
		      return right;
		    }else  if(array[left]<=target){
		      return left;
		  }
		  //cannot find ---> print array from left to right (-1+1 =0)
		  return -1;
		}
}
