package chapter2;

public class Q3 {
	
	public static void deleteInterNode(Node interNode){
		Node runner = interNode;

		if(interNode == null){
			System.out.println("Error");
			return;
		}
		else if(interNode.next == null){
			interNode = null;
			return;
		}
		else {//not null and it's next is not null either
			runner.data = runner.next.data;
			runner.next = runner.next.next;
		}
	}
}
