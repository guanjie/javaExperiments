package chapter3;

public class Queue {
	Node first;
	Node last;

	void enqueue(Object item){
		if(last!=null){
			Node temp = new Node(item);
			last.next = temp;
			last = temp;
		} else if(last == null&&first == null){
			Node temp = new Node(item);
			first = temp;
			last = temp;
		}
	}

	Object dequeue(){
		if(first!=null){
			Object obj = first.data;
			first = first.next;
			return obj;
		}else{
			return null;
		}
	}
}
