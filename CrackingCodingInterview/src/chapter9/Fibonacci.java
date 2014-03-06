package chapter9;

public class Fibonacci {

	public static int fibonacci(int n){
		if(n==0) return 0;
		if(n==1) return 1;
		
		return fibonacci(n-1)+fibonacci(n-2);
	}
	
	
	public int factorial(int n){
		if (n<0) return Integer.MIN_VALUE;
		
		if(n==1||n==0) return 1;
		else return n*fibonacci(n-1);
	}
}


