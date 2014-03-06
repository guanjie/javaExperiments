package chapter17;

public class Chapter17s {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Question 1 of the Moderate Questions Chapter: ");
		int x = 5; int y = 7;
		Q1.swapNumber(x, y);
		System.out.println();
		
		System.out.println("Question 3 of the Moderate Questions Chapter: ");
		int check = Q3.countZeros(1);
		int test = Q3.factorial(7);
		System.out.println(check);
		System.out.println();
		
		//This has problem when it's sorted already
		System.out.println("Question 6: ");
		int[] testing = {1,2,2,1,5};
		int[] mn = Q6.sortNums(testing);
		for(int i: testing)System.out.println(i);
		System.out.println(mn[0]);
		System.out.println(mn[1]);
		
		//Question 7:
		System.out.println();
		System.out.println("Question 7: ");
		
		//Question 8:
		System.out.println();
		System.out.println("Question 8: ");
		System.out.print("This part is the solution of Question 8 of chapter 17: ");
		int[] arr = {2,-8,3,-2,4,-10};
		int[] arr1 =  {-1,-2,-3};
		int[] arr2 = {2,4,-2,1,5,-8};
		int maxSum = Q8.getMaxSum(arr);
		System.out.println(maxSum);
		
		//Question 9:
		System.out.println();
		System.out.println("This part is about returning the frequency of occurance of any word in a file.");
		System.out.println("Shows the frequency of occurence of a word in an array of words--book.");
		
		//Question 11:
		System.out.println();
		System.out.println("Question 11 of chapter 17: ");
		System.out.println("Getting rand7() given we have rand5()");
		
		//Question 12:
		System.out.println();
		System.out.println("Question 12 of chapter 17: ");
		System.out.println("This part of the question trys to find all pairs of integers forming sprcified value.");
		int[] arr12 = {2,1,-4,7,6,8,10};
		Q12.printPairs(arr12, 8);
		
	
		
	}
}
