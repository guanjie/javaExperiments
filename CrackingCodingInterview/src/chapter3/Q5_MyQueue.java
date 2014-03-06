package chapter3;

public class Q5_MyQueue {//Also question 5: 
	
	Stack enqueueStack;
	Stack dequeueStack;
	
	Q5_MyQueue(){
		enqueueStack = new Stack();
		dequeueStack = new Stack();
	}
	
	void enqueue(int number){
		enqueueStack.push(number);		
	}
	
	int dequeue(){
		if(dequeueStack!=null){
			int temp = dequeueStack.pop();
			return temp;
		} else if(dequeueStack==null&&enqueueStack==null){
			return Integer.MAX_VALUE;
		} else if(dequeueStack==null&&enqueueStack!=null){
			while(enqueueStack!=null){
				int temp = enqueueStack.pop();
				dequeueStack.push(temp);
			}
			int temp = dequeueStack.pop();
			return temp; 
		}
		return Integer.MAX_VALUE;
	}
	
	int peek(){
		if(dequeueStack!=null){
			return dequeueStack.peek();
		} else if(dequeueStack==null&&enqueueStack==null){
			return Integer.MAX_VALUE;
		} else if(dequeueStack==null&&enqueueStack!=null){
			while(enqueueStack!=null){
				int temp = enqueueStack.pop();
				dequeueStack.push(temp);
			}
			return dequeueStack.peek();
		}
		return Integer.MAX_VALUE;
	}
}
