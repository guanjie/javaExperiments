package chapter5;

public class Q5_NumBitsNeededConvertingIntegers {

	public static int checkingNumbers(int num1, int num2){
		int xor = num1^num2;
		int count = 0;
		
		if(xor<0){
			System.out.println("Not right assumption");
			return Integer.MIN_VALUE;
		} else if(xor == 0){
			System.out.println("The two numbers are already the same");
			return 0;
		}
		
		//peasant but on the ground:
		//Counting number of 1s in xor;
		while(xor!=0){
			if((xor&1)==1){
				count++;
				xor = (xor>>1);   //Shit, wrong here, need to be pushing the bits, rather then dividing the ten!
				continue;
			} else if((xor&1) == 0){
				xor = (xor>>1);
				continue;
			}
		}
		
		//Beautiful 1:
//		for(int c = xor; c!=0; c = (c>>1)){
//			count += c&1;
//		}
		
		//Beautiful 2: 
//		for(int c = xor; c!=0; c = (c&(c-1))){
//			count++;
//		}
		
		//Count is the number of bit 1 in the xor(difference between two integers);
		return count;
		
	}
}
