package chapter16;

import java.util.concurrent.locks.Lock;

public class Q3 {

}

public class Chopstick{
	private Lock lock;
	
	public void pickUp(){
		lock.lock();
	}
	
	public void putDown(){
		lock.unlock();
	}
	
	public boolean pickedUp(){
		return lock.tryLock();
	}
	
}

public class Philosopher extends Thread{
	
	private Chopstick left;
	private Chopstick right;
	
	public Philosopher(Chopstick left, Chopstick right){
		this.left = left;
		this.right = right;
	}
	
	public void eat(){
		pickUp();
		if(pickedUp()){
		eat();
		putDown();
		}
	}
	
	public void pickUp(){
		left.pickUp();
		right.pickUp();
	}
	
	public boolean pickedUp(){
		if(!left.pickedUp()){
			return false;
		} else if(!right.pickedUp()) {
			left.putDown();
			return false;
		} else
			return true;
	}
	
	public void putDown(){
		left.putDown();
		right.putDown();
	}
	
	public void run(){
		for(int i = 0; i < 10; i++)
			eat();
	}
	
}