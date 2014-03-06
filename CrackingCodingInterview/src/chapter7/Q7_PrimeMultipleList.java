package chapter7;

import java.util.LinkedList;
import java.util.Queue;

public class Q7_PrimeMultipleList {
	
	
	public int getKthMagicNumber(int k){
		Queue<Integer> queue = new LinkedList<Integer>();

		//putting first integer as 1:
		queue.add(1);
		//Adding first iterations:
		int val = 1;
		addProducts(queue, val);
		
		for(int i = 0; i < k; i++){//recurse k times, since we put 1 inside the queue already, it counts as the first element of the queue.
			val = removeMin(queue);
			addProducts(queue, val);//Every time adding 3; Everytime removing any(since we use while to remove the smallest integer);
		}
		
		return val;
	}
	
	public int removeMin(Queue<Integer> queue){
		int min = queue.peek();
		for(int i:queue){
			if (i < min){
				min = i;
			}
		}
		while(queue.contains(min)){
			queue.remove(min);
		}
		return min;
	}
	
	
	public void addProducts(Queue<Integer> queue, int value){
		queue.add(value*3);
		queue.add(value*5);
		queue.add(value*7);
	}

}
 