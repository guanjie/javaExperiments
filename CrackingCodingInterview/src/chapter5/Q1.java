package chapter5;

public class Q1 {
	
	static int merging2Integers(int M, int N, int i, int j){
		
		//Assume all these number could be used directly. Say i < j, M could fit into N with no exceptions.
		int mask_right = (1<<i)-1;
		int mask_left = ~(1<<(j+1)-1);
		int mask = mask_right|mask_left;
		
		return (N&mask)|(M<<i);
	}

}
