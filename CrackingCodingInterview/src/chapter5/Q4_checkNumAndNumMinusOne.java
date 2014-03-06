package chapter5;

public class Q4_checkNumAndNumMinusOne {
	
	public static int checkThis(int num){
		
		return ((num&(num-1))==0?10000:10110);
	}

}
