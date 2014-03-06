package chapter5;

public class Q6_SwappingOddEvenDigits {

	public static int swappingOddEven(int num){
		int evenMask = 0xaaaaaaaa;
		int oddMask = 0x55555555;
		
		return ((num&evenMask)>>1)|((num&oddMask)<<1);
		//It's the OR function!
	}
}
