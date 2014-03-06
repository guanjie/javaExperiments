package chapter17;

import java.util.Arrays;

public class Q12 {
	public static void printPairs(int[] arr, int sum){
		
		Arrays.sort(arr);
		
		//Attention that only j back to i is necessary.
		for(int i = 0; i < arr.length;i++){
			for(int j = arr.length-1; j >= i; j--){
				if(arr[i]+arr[j]==sum)
					System.out.println("two integers are:"+arr[i]+" and "+arr[j]);
				else if(arr[i]+arr[j] < sum) break;
			}
		}
	}
}
