package chapter3;

public class Q2 {//Stack for Q2

	Node top;
	
	Object pop(){
		int num = top.data;
		top = top.next;
		return num;
	}
	
	void push(int num){
		Node temp = new Node(num);
		if(num<=this.top.minValue){
			temp.minValue = num;
		} else {temp.minValue = this.top.minValue;}
		temp.next = top;
		this.top = temp;		
	}
	
	Object peek(){
		return this.top.data;
	}
	
	int min(){
		if(top!=null){
			return top.minValue;
		} else {
			return Integer.MAX_VALUE;
		}
	}
}
