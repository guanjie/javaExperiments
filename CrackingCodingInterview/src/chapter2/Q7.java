package chapter2;

import java.util.LinkedList;
import java.util.Stack;

public class Q7 {
	public static boolean isPalindrome(Node head){
		
		Node runner = head;
		Stack stack = new Stack();
		while(runner.next!=null){
			stack.push(runner.data);
		}
		
		boolean result = checkingBoolean(stack, head);
		return result;
	}
	
	public boolean checkingBoolean(Stack stack, Node head){

		//XXX This part is pretty. Checking if the stack has the value as the LinkedList itself.
		Node runner = head;
		while(runner.next!=null){
			int top = stack.pop().intValue();
			if(runner.data!=top){
				return false;
			} else {
				runner = runner.next;
			}
		}
		return true;
	}

}
