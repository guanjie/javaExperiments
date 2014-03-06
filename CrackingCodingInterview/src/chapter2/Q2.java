package chapter2;

public class Q2 {

	public static Node kthToLastElement(Node head, int k){
		Node runner1 = head;
		Node runner2 = head;
		
		//Check null linkedList;
		if(runner2==null) {
			System.out.println("Null LinkedList.");
			return null;
		}
		
		//Running runner2 to kth from runner1;
		for(int i=0; i < k; i++){
			if(runner2.next==null){
				System.out.println("Error;");
				return null;
			}
			else {
				runner2 = runner2.next;
			}
		}
		
		//This part is trivial;
		if(runner2 == null){
			System.out.println("Error; this time it accidently reaches last element.");
			return null;
		}
		
		while(runner2.next!=null){
			runner1 = runner1.next;
			runner2 = runner2.next;
		}
		
		return runner1;
		
	}
	
	
	
	
	
//	public static Node kthToLastElement(Node head, int k){	
//		Node runner = head;
//		if(head == null) {
//			System.out.println("It's a null LinkedList.");
//			return head;
//		}
//		//If finding elements here is displaying the elements, here is the solution:
//
//		for(int i = 0; i < k-1; i++){
//			if(runner.next!=null){
//				runner.next = runner.next.next;
//			}
//			else {
//				System.out.println("Can't iterate enough elements");
//				return head;
//			}
//		}
//		
//		while(runner.next!=null){
//			System.out.println(runner.data+" ");
//			runner = runner.next;
//		}
//
//		return head;
//	}理解错了，纯理解错了，是kth to the last element这么个写法
	
}
