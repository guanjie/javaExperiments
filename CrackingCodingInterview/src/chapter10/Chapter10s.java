package chapter10;

import java.util.Arrays;

public class Chapter10s {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		
		//Q1: the putting arrB into arrA
		int[] arrA=new int[11];
		int[] arrB={4,6,8};
		arrA[0]=1;
		arrA[1]=2;
		arrA[2]=3;
		arrA[3]=5;
		arrA[4]=7;
		System.out.println("Question 10-1: ");
		System.out.print("This part is to print out the sorted 2 arrays from the 2 sorted inputs: ");
		Q1.merge2arr(arrA, arrB, 5, 3);
		for(int i:arrA)
			System.out.println(i);
		
		
		//Q2: Sorting an array of strings so that all the anagrams are next to each other.
		String[] strs = {"yea", "asdf", "eay","dsaf"};
		System.out.println();
		Arrays.sort(strs, new Q2AnagramComparator());
		System.out.println("Question 10-2: ");
		System.out.println("This part is to print out the anagram lists");
		for(String str:strs){
			System.out.println(str);
		}
		
		
		//Q3: Given a sorted array but rotated. Give logn algorithm that finds index of a particular number.
		int x = 7;
		int[] arr = {15,16,19,20,25,1,3,4,5,7,10,14};
		int start = 0;
		int end = arr.length-1;
		System.out.println();
		System.out.println("Question 10-3: ");
		System.out.print("This part is to print out the index of a rotated number array: ");
		System.out.println(Q3.getIndex(arr, x, start, end));
		
		
		//Q4: Given 20GB file, sort the strings inside it
		/*
		1. Divide it to small trunks
		2. Sorting the small trunks of data
		3. Merge the small trunks back into the whole file, make the file.
		*/
		
		
		//Q5: Given sorted string array interspersed with empty string, find the location of a given string.
		String[] strs1 = {"at","","","","ball","","","car","","","dad","",""};
		System.out.println();
		System.out.println("Question 10-5: ");
		System.out.print("This part is to print out the index of a specific string in a string array: ");
		Q5.checkingIndex(strs1, "ball");
		
		
		//Q6 find a number in a matrix where all rows and cols are sorted.
		int[][] matrix = {{2,5,10,11},{3,7,11,12},{5,9,20,25}};
		int num = 12;
		System.out.println();
		System.out.println("Question 10-6: ");
		System.out.print("This part is to find the position of a number in a matrix: ");
		int[] nums = Q6.findNumber(matrix, num);
		for(int i:nums){
			System.out.print(i+" ");
		}
		
		
		//Q7 Compute the largest possible human tower that could be established under the condition that people above need to have lower weight and lower height
		int[][]data = {{65,100},{70,150},{56,90},{75,190},{60,95},{68,110}};
		
		
	}
}
