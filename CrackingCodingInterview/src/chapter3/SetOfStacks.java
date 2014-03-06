package chapter3;

import java.util.ArrayList;

public class SetOfStacks {
	ArrayList<Stack> stacks = new ArrayList<Stack>();
	Stack lastStack = new Stack();
	final int stackSize = 100;
	
	//Pop() function, popping out the object from the stack
	Object pop(){
		lastStack = getLastStack();
		if(lastStack!=null){
			int num = lastStack.pop();
			return num;
		} else {stacks.remove(stacks.size()-1);
			return null;
		}
	}
	
	//PopAt() function: popping an integer from a specific stack from the ArrayList stacks
//	Object popAt(int index){
//		Stack temp = stacks.get(index);
//		if(temp!=null){
//			Node pointTo = temp.top.next;
//			
//			int num = temp.pop();
//			temp.top.next = pointTo;
//			return num;
//		} else {
//			
//		}
//	}

	//Push() function, pushing a number into the stack.
	void push(int num){
		lastStack = getLastStack();
		if(!isFull(lastStack)){
			lastStack.push(num);
		} else if(isFull(lastStack)){
			Stack newStack = new Stack();
			newStack.push(num);
			stacks.add(newStack);
		}
	}
	
	Stack getLastStack(){
		Stack temp = stacks.get(stacks.size()-1);
		return temp;
	}
	
	boolean isFull(Stack stack){//XXX
		//With some limitations, see whether it's full, has some threshold like 100 as the size of the stack.
		if(stack.getStackSize() >= 100) return true;
		else return false;	
	}
	
}
