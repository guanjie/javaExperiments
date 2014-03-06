package chapter5;

public class Q2 {
	
	//Given a double real number between 0 and 1, then print the binary presentation. 
	public static void printRepresentation(double num){
		System.out.print("0.");
		int count = 0;
	
		if(num<0 || num > 1){
			System.out.println("This problem has wrong assumptions");
			return;
		}
		
		while(num>0){//when the number could be divided, num==0;
			num = num*2;
			if(count>=32){
				System.out.print("Can't represent the number");
				break;
			}
			count++;
			if(num>=1){
				System.out.print(1);
				num--;
			} else if(num <= 1){
				System.out.print(0);
			}
		}
		
	}

}
