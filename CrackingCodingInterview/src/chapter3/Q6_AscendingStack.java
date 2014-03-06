package chapter3;

public class Q6_AscendingStack extends Stack {

	Stack ascendingStack(Stack dataStack){
		Stack stack1 = new Stack();
		Stack stack2 = new Stack();
		
		while(dataStack!=null){
			insert1Data(dataStack, stack1, stack2);
		}
		getReadyForAscending(stack1, stack2);
		return stack1;
		
	}
	
	void getReadyForAscending(Stack stack1, Stack stack2){
		if(stack2 == null)
			return;
		else if(stack2!=null){
			while(stack2!=null){
				int temp = stack2.pop();
				stack1.push(temp);
			} 
			return;
		}
	}
	
	void insert1Data(Stack dataStack, Stack stack1, Stack stack2){
		if(dataStack!=null){
			int data = dataStack.pop();
			getReadyForAscending(stack1, stack2);//Ready to rock and roll.

			if(stack1 == null){
				stack1.push(data);
				return;
			} else if ( stack1 != null){
				while(data<stack1.peek()){
					int stack1Pop = stack1.pop();
					stack2.push(stack1Pop);
				}
				stack1.push(data);
			}
			getReadyForAscending(stack1, stack2);
			
		}else
			return;
	}
}
