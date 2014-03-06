package chapter17;

import java.util.Arrays;


//XXX 1. int[] sortedNums = originalNums.clone();
//XXX 2. get out of while when the condition doesn't hold.--This is important and fun.
public class Q6 {
	public static int[] sortNums(int[] originalNums){
		int[] sortedNums = originalNums.clone();
		Arrays.sort(sortedNums);
		
		int m;
		int n;
		
		int index = 0;
		while(originalNums[index] == sortedNums[index]&&index<originalNums.length){//when not the same, get out
			index++;
		}
		m = index;
		
		int pivot = originalNums.length-1;
		while(originalNums[pivot] == sortedNums[pivot]&&pivot>=0){//when not the same, get out
			pivot--;
		}
		n = pivot;
		int[] mn = {m,n};
		return mn;
	}

}
