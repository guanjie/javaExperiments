package chapter17;

public class Q3 {
	

	public static int countZeros(int n){
		int x = factorial(n);
		int count = 0;

		while(x>0){
			if(x%10 == 0) count++;
			x = x/10;
		}
		return count;
	}
	
	public static int factorial(int n){
		if(n == 1) return 1;
		if(n == 0) return 1;
		
		return n*factorial(n-1);
	}
}
