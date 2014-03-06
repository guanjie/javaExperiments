package chapter7;

public class Q4_multiplying_divding_subtracting {

	//Negation XXX useful.:
	public static int negate(int a){
		int neg = 0;
		int addOn = (a>0)?-1:1;
		while(a!=0){
			neg += addOn;
			a += addOn;
		}
		return neg;
	}
	
	//Subtraction:
	public static int subtract(int a, int b){
		
		return a + negate(b);
	}
	
	//Multiplication:
	public static int multiply(int a, int b){
		
		int sum = 0;
		for(int i = abs(a); i > 0; i--){
			sum+=b;
		}
		return a>0?sum:negate(sum);
		
	}
	
	public static int abs(int num){
		return num>0?num:negate(num);
	}
	
	//Division:
	public static int divide(int a, int b) throws ArithmeticException{
		
		int absA = abs(a);
		int absB = abs(b);
		
		int division = absB;
		int count = 0;
		
		if(b == 0){
			throw new java.lang.ArithmeticException("ERROR!!!!!!!!!!!!!!!");
		}
		
		while(absA>=division){
			division += absB;
			count++;
		}
		
		if((a>0&&b>0)||(a<0&&b<0)){
			return count;
		} else return negate(count);
		
	}
	
	
	
}









































