package chapter9;

public class Q3 {

	//MidPoint -- must have a fit, otherwise no return?/Fixed -- Condition ahead.
	//XXX this actually has bug inside. But didn't work out yet.
	public static int magicIndexMidPoint(int[] arr, int left, int right){
		if(right < left||right>=arr.length||left<0) return -1;
		
		int midPt = (left+right)/2;
		if(midPt == arr[midPt]) {
			return midPt;
		} else if(midPt < arr[midPt]) {
			return magicIndexMidPoint(arr, midPt+1, right);
		} else {
			return magicIndexMidPoint(arr, left, midPt-1);
		}
	}
	
	
	//Brute force
	public static int magicIndex(int[] arr){
		for(int i = 0; i < arr.length; i++){
			if(i == arr[i]) return i;
		}
		return -1;
	}
}
