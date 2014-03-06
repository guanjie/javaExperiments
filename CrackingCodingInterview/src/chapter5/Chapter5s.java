package chapter5;

public class Chapter5s {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Bit Manipulation is this chapter's main theme.
		//getBit:
		boolean check = PreKnowledge.getBit(4, 2);
		System.out.println(check);
		
		//setBit:
		int temp = 4;
		PreKnowledge.setBit(temp, 1);
		System.out.println(PreKnowledge.setBit(temp, 1));
		
		//clearBit:
		System.out.println(PreKnowledge.clearBit(temp, 2));
		
		//clearLSBtoI:
		System.out.println(PreKnowledge.clearLSBtoI(14, 2));
		
		//!!!!!!!!!!!!!!!!!!!!!!!!!! Take-away. Must write this way: (1<<i)-1; must have parenthesis.
		//clearMSBtoI:
		System.out.println(PreKnowledge.clearMSBtoI(15, 3));
		
		
		//Question 2: If the interviewer thinks it's ok to just print out the double number: 
		System.out.println();
		System.out.println("This part is the Question 2: ");
		Q2.printRepresentation(0.75);
		
		//Question 4: 
		System.out.println();
		System.out.println("This part is the Question 5.4, checking what the n&(n-1) does");
		System.out.println(Q4_checkNumAndNumMinusOne.checkThis(9));
		
		//Question 5: Though my method is a little peasant, it works fine. Be careful, xor = (xor>>1);
		System.out.println();
		System.out.println("This part is the Question 5 of chapter 5: ");
		System.out.println(Q5_NumBitsNeededConvertingIntegers.checkingNumbers(61, 0));
		
		//Question 6: Using as less instructions to swap the odd and even digits from an integer: 
		System.out.println();
		System.out.println("This part is the Question 6 of Chapter 5: Swapping the Odd and Even digits from an integer: ");
		System.out.println(Q6_SwappingOddEvenDigits.swappingOddEven(11));
		
		//Question 8: 
		//Drawing a bit line on a byte screen. The byte array was given and starts from there.
		//Now I have tons of respect to myself that I could pull out a question like this => 1. Small sample indication; 2. seperate discussions. 
		
		
	}

}
