package chapter10;

public class Q3 {
	
	public static int getIndex(int[] arr, int x, int start, int end){
		int mid = (start+end)/2;
		if ( x == arr[mid] ) return mid;
		if ( start > end ) return -1;
		
		if( arr[start] < arr[mid] ){
			//if left side normal
			if( x <= arr[mid]&& x >= arr[start]){
				return getIndex(arr, x, start, mid-1);
			} else {
				return getIndex(arr, x, mid+1, end);
			}
		} else if ( arr[mid] < arr[end] ){
			//if right side normal
			if(x < arr[end]&&x > arr[mid]){
				return getIndex(arr, x, mid+1, end);
			}else{
				return getIndex(arr, x, start, mid-1);
			}
		} 
//		else if ( arr[start] == arr[end]){
//			//if leftest number == rightest number.
//		}
		return -1;
	}
}
