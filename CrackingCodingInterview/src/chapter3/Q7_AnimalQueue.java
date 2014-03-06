package chapter3;

import java.util.Random;

public class Q7_AnimalQueue extends Queue{
	
	Queue dogQueue;
	Queue catQueue;
	
	Q7_AnimalQueue(){
		dogQueue = new Queue();
		catQueue = new Queue();
	}
	
	void enqueue(Object obj){
		if(obj instanceof Q7_Cat){
			catQueue.enqueue(obj);
		} else if(obj instanceof Q7_Dog){
			dogQueue.enqueue(obj);
		} else return;
	}
	
	Object dequeueDog(){
		if(dogQueue!=null){
			Object obj= dogQueue.dequeue();
			return obj;
		} else return null;
	}
	
	Object dequeueCat(){
		if(catQueue!=null){
			Object obj = catQueue.dequeue();
			return obj;
		} else return null;
	}
	
	Object dequeueAny(){
		Random rand = new Random();
		if(rand.nextInt(2) == 0){
			if(catQueue!=null){
				return dequeueCat();
			} else {
				return dequeueDog();
			}
		} else if(rand.nextInt(2) == 1){
			if(dogQueue!=null){
				return dequeueDog();
			} else {
				return dequeueCat();
			}
		}
		return null;
	}

}
