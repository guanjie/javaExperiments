package chapter2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;



public class Chapter2s {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		//Question 1:
		System.out.println("This part is for question 1: and this runner thing is beautiful. Practice makes perfect. This always holds man.");
		
		//Question 2:
		//Always crucial to test while(runner.next!=null) testing this would directly test whether the node has reached the last node of the list or not.
		//Question 3: 
		//XXX discussing the various conditions before going into the details.
		
		//Question 4: 
		//To partition a list into two lists with first half less than a specific number, latter half bigger than or equal to the number. 
		//My way was more straight-forward and easily comprehended.
			
		//Question 5: XXX Didn't work it out.
		//Adding two List as digits and then return the sum of the two.
		//LinkedList l1 = new LinkedList();
		//LinkedList l2 = new LinkedList();
		//l1.add(5);
		//l1.add(7);
		//l1.add(8);
		//l2.add(1);
		//l2.add(6);
		//l2.add(9);
		
		//Question 6: starting from the head, one slow runner one fastRunner, if they collide, then there is a loop. 
		//Then make slowRunner the head and then both it and fastRunner run 1 step a time, they will collide at the starting Node of the loop.

		//Question 7: When there is reverse()--->Stacks, using stacks
		
	}
}
