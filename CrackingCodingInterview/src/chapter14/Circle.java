package chapter14;

public class Circle extends Shape{
	private double rad = 5;
	public void printMe(){
		System.out.println("This has changed, and I am a circle! ");
	}
	
	public double computeArea(){
		return rad*rad*3.14;
	}
}