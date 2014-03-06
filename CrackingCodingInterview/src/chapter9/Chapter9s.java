package chapter9;

import java.util.HashMap;

public class Chapter9s {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Q1 Part
		//The running Steps
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		System.out.println("Question 1: ");
		System.out.print("The different ways running the steps are: ");
		System.out.println(Q1.runningSteps(5));
		System.out.print("Using DP we have the result as: ");
		System.out.println(Q1.runningStepsDP(5, map));
		System.out.println();

		
		//Fibonacci Part
		int n = 6;
		int x = Fibonacci.fibonacci(n);
		System.out.println("Question 0:");
		System.out.println("This part is the Fibonacci part: ");
		System.out.print("the "+n+"th number is: ");
		System.out.println(x);
		System.out.println();
		
		//Q3 Part
		int[] arr = {1,2,3,4,5,5,7,8,9};
		System.out.println("Question 3:");
		System.out.print("The magicIndex from this array is: ");
		System.out.println(Q3.magicIndex(arr));
		
		System.out.print("This should be the MidPoint magicIndex: ");
		System.out.println(Q3.magicIndexMidPoint(arr, 0, arr.length-1));
	}
}


