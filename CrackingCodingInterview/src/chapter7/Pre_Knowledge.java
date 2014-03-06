package chapter7;

public class Pre_Knowledge {

	//Pre-Knowledge:
	
	//1. GCD, LCM--Greatest Common Divisor, Least Common Multiple.
	//GCD has that the min of each prime number's exponential number times each other.  
	//LCM has that the max of each prime number's exponential number times each other.
	//GCD*LCM = x*y;

	//2. Checking prime naive: XXX remember to consider all ways in this small implementation: 
	public static boolean checkPrimeNaive(int num){
		if(num<2) return false;
		else if(num==2) return true;
		else for(int i = 2; i < num; i++){
			if(num%i==0) return false;
		} 
		return true;
	}
	
	//2. Slightly better:
	public static boolean checkPrimeSlightBetter(int num){
		if(num < 2) return false;
		else if(num==2) return true;
		else {
			int sqrt = (int)Math.sqrt(num); //XXX int sqrt = (int)Math.sqrt(num);
			for( int i = 2; i <= sqrt; i++){
				if(num%i==0) return false;
			}
			return true;
		}
	}
	
	//3. The part only checking the prime numbers from a multiple number of primes: XXX mei kan dong......
	/*
	 * 
	 * Needs to further derive from the equation: 
	 * 
	 */
	
	
	
	
	//4. Independence: P(A and B) = P(A)*P(B);
	//P(B given A) = P(B) since A indicates nothing about B;
	
	//5. Mutual Exclusivity: P(A or B) = P(A) + P(B): since P(A and B) = 0; hence the term was removed from the P(A or B) equation;
	
	//Independence and Mutual Exclusivity can't both happen at the same time, since Mutual exclusivity is that one happens means the other can't happen;
	//Whereas Independence means that one happens tells nothing about whether the other may happen or not;
	
	
}
