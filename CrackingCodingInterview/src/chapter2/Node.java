package chapter2;

//Every time retrieving memory just do it again. Node next, int data, then constructor then the void appending method appends the last node to the linked list.
public class Node {

	Node next;
	int data;
	
	public Node(int data){
		this.next = null;
		this.data = data;
	}
	
	public void appendNode(int number){
		Node endNode = new Node(number);
		Node temp = this;
		while(temp.next!=null){
			temp = temp.next;
		}
		temp.next = endNode;
	}

	//while(!=null)is easier to implement
	//For this question it's a singly linkedList.
	public static void deleteNode(int data, Node head){
		Node runner = head;
		
		//if the first node needs to be deleted
		if(runner.data==data) head = head.next;

		while(runner.next!=null){
			if(runner.next.data == data) {
				runner.next = runner.next.next;
				return;
			}
			else if(runner.next.data != data){
				runner = runner.next;
			}
		}
	}
}
