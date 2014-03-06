package chapter10;

public class Q1 {

	//Q1: putting sorted arrB into sorted arrA when arrA has enough space to contain arrB
	public static void merge2arr(int[] arrA, int[] arrB, int lengthA, int lengthB){
		int indexALast = lengthA-1;
		int indexBLast = lengthB-1;
		int newIndexALast = lengthA+lengthB-1;
		
		while( indexALast >=0 && indexBLast >=0 ){
			if(arrA[indexALast]>arrB[indexBLast]){
				arrA[newIndexALast] = arrA[indexALast];
				indexALast--;
				newIndexALast--;
			} else if (arrA[indexALast]<arrB[indexBLast]){
				arrA[newIndexALast] = arrB[indexBLast];
				indexBLast--;
				newIndexALast--;
			}
		}
		
		while( indexBLast >=0 ){
			
			arrA[newIndexALast] = arrB[indexBLast];
			newIndexALast--;
			indexBLast--;
		}
	}
}
