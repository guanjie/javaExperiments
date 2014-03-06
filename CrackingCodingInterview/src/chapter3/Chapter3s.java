package chapter3;

public class Chapter3s {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Chapter 3: Stacks and Queues. The LinkedList used tackling real world problems.
		
		//Question 2: How to use a single array to implement three stacks.
		//Setting a minValue for each Node pushed into the stack, that each node may represent a state of an entire stack, with the value of minValue inhereted in Node top.
		
		//Question 4: Using stacks to implement the Hanoi tower problem.
		{
			//The set-up of Question 4:
			int towerNumber = 3;
			int diskNumber = 5;
			Q4_Tower[] towers = new Q4_Tower[towerNumber];
			//Initiate 3 towers: 
			for(int i = 0; i < towerNumber; i++){
				towers[i] = new Q4_Tower(i);
			}
			//Setting up Tower 1:
			for(int i = diskNumber-1; i >=0; i--){
				towers[0].add(i);
			}
			//Starting algorithm moving disks around:
			towers[0].moveDisks(diskNumber, towers[1], towers[2]);
		}
		
		//Question 5: Implementing MyQueue using two stacks and one-in an one-out; 
		//Done and Beautiful.
		
		//Question 6: Write a stack in ascending order. With the help of any number of stacks
		
		//Question 7:AnimalQueue--Writing a animal shelter Queue.
		//I think mine is beautiful. But I used queue:
		
	}

}
