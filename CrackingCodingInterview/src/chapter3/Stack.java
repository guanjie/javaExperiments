package chapter3;

public class Stack {//It's all about the value of the Node! It's all about value of the Node!!

	Node top;//top is a node, not a value.
	//type more times then it's easier to figure out what is what.
	int stackSize = 0;
	
	int pop(){
		int num = top.data;
		top = top.next;
		stackSize++;
		return num;
	}
	
	void push(int num){
		Node temp = new Node(num);
		temp.next = top;
		stackSize--;
		this.top = temp;		
	}
	
	public int getStackSize() {
		return stackSize;
	}

	public void setStackSize(int stackSize) {
		this.stackSize = stackSize;
	}

	int peek(){
		return this.top.data;
	}

	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return this.stackSize==0?true:false;
	}
}
