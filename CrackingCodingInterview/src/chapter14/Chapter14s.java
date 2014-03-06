package chapter14;


public class Chapter14s {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Chapter 14 Questions:
		System.out.println("Following are Chapter 14 questions: ");
		Shape[] shapes = new Shape[2];//XXX interesting, didn't realize General.Shape()[2] should not work
		Circle circle = new Circle();
		Square square = new Square();
		shapes[0] = circle;
		shapes[1] = square;
		for(Shape s:shapes){
			s.printMe();
			System.out.println(s.computeArea());
		}		
		System.out.println();
		
		
		//Question 1 from Chapter 14:
		System.out.println("Q1: This part is the Q1 of Chapter14: ");
		Q1 q1 = new Q1(10,20);
		System.out.println(q1.x);
		
		
		//Question 2 from Chapter 14:
		System.out.println();
		System.out.println("Q2: This part is for discussion and descriptions of the terminologies: final, finally and finalize");
		/**
		 * final:used for variables, classes, methods. when used, variables can't be changed, methods can't be overridden, class can't be subclassed.
		 * finally:used with try/catch block, ensuring a block of code would be executed anyway
		 * finalize: Garbage Collector's method, using before cleaning up the memory. Could be overridden for customized application 
		 */
		
		
		//Question 3 from Chapter 14:
		System.out.println();
		System.out.println("Q3: This part if for whether finally block would execute if the previous block has returned a variable or so.");
		/*
		 * finally: yes this block of code would be executed no matter whether the previous block returns any variables or not.
		 */
		
		
		//Question  4 from Chapter 14:
	}
	
}
