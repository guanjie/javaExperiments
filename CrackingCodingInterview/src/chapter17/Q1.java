package chapter17;

public class Q1 {

	//1.Need to show the new x and y in the method itself
	//2.找一个例子，写出来方法
	public static void swapNumber(int x, int y){
		x = x-y;
		y = y+x;
		x = y-x;
		
		System.out.println("new x is: " + x);
		System.out.println("new y is: " + y);
	}
}
