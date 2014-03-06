package chapter3;

public class Q4_Tower {//This is also Question 4: 
	int index;
	private Stack disks;
		
	Q4_Tower(int index){
		this.index = index;
		this.disks = new Stack();
	}

	void moveDisks(int n, Q4_Tower buffer, Q4_Tower destination){//XXX this part is the main algorithm function bracket.
		//XXX put on the condition in here: 
		if(n > 0){		
			moveDisks(n-1, destination, buffer);
			moveTop();
			moveDisks(n-1, buffer, destination);
		}
	}
	
	void moveTop(){
		System.out.println("This is where tower0 gets moved: " + this.disks.pop());
	}
	
	void add(int data){
		if(!disks.isEmpty()&&disks.peek()<=data){
			System.out.println("Error here for not being able to push data to one less than it.");
		} else {
			this.disks.push(data);
		}
	}
	
	boolean isEmpty(){
		return disks==null?true:false;
	}

}
