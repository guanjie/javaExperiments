package chapter5;

public class PreKnowledge {
	
	//Always starts with 1<<i; 
	//Get Bit:
	static boolean getBit(int num, int i){
		return ((1<<i)&num)!=0?true:false;
	}
	
	//Set Bit(To 1):XXX Needs to return, since it's integer manipulation.
	static int setBit(int num, int i){
		return (1<<i)|num;
	}
	
	//Clear Bit:
	static int clearBit(int num, int i){
		return ~(1<<i)&num;
	}
	
	//Clear Bits from the least significant big through i(inclusive):
	static int clearLSBtoI(int num, int i){
		return (~((1<<(i+1))-1))&num;
	}
	
	//Clear Bits from the most significant bit to i:
	static int clearMSBtoI(int num, int i){
		int mask = ((1<<i)-1);
		System.out.println("mask is: "+mask);
		return mask&num;
	}

}
