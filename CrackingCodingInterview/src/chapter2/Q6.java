package chapter2;

public class Q6 {

	public static LinkedListNode collidingNode(LinkedListNode head){
		LinkedListNode slowRunner = head;
		LinkedListNode fastRunner = head;
		
		//Finding the Collision point first:
		while(fastRunner!=null&&fastRunner.next!=null){
			slowRunner = slowRunner.next;
			fastRunner = fastRunner.next.next;
			if(slowRunner == fastRunner){
				break;
			}
		}
		
		//Checking whether it's colliding break out;
		if(slowRunner == null||fastRunner == null||fastRunner.next == null){
			return null;
		} else {//Colliding break, not null break.
			slowRunner = head;
			while(slowRunner!=fastRunner){
				slowRunner = slowRunner.next;
				fastRunner = fastRunner.next;
			}
			return slowRunner;
		}
	}
}
