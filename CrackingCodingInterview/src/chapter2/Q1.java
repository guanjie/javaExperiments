package chapter2;

import java.util.Hashtable;

public class Q1 {

	//Write it my way.
	//The method with a buffer Hashtable.
	public static void deleteDuplicate(Node node){
		Hashtable<Integer, Boolean> table = new Hashtable<Integer, Boolean>();
		Node runner = node;
		if(node == null) return;
		table.put(node.data, true);
		
		while(runner.next!=null){
			if(table.contains(runner.next.data)){
				runner.next = runner.next.next;
			}
			else if(!table.contains(runner.next.data)){
				table.put(runner.next.data, true);
			}
			runner = runner.next;
		}
	}
	
	//The method with NO buffer Hashtable.
	public static void deleteDuplicateNoBuffer(Node head){
		Node current = head;
		if(head == null)return;
		
		while(current.next!=null){
			Node runner = current;//no need to go next.
			while(runner.next != null){
				if(runner.next.data==current.data){
					runner.next = runner.next.next;
				}
				else if(runner.next.data!=current.data){
					runner = runner.next;
				}
			}
			current = current.next;
		}
	}
}
