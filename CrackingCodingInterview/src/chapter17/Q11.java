package chapter17;

public class Q11 {

	//XXX put a return in a while loop then it will surely return some number.
	//Given rand5(), try to resolve rand7():

	public static int rand7(){
		while(true){
			int sum = rand5()*5+rand5();
			if(sum<=20){
				return sum%7;
			}
		}
	}
	
	public static int rand5(){//This is skeleton for now.
		return 0;
	}
}
