package fanXing_YiChang_25_26;

import java.io.FileReader;

public class test4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Father father = new Father();
		father.test1();
		
	}

}

class Father{
	
	private Son son = null;
	public Father(){
		this.son = new Son();
	}
	public void test1(){
		System.out.println("1");
		try{
			son.test2();
			
		}catch(Exception e){
			
			e.printStackTrace();
			
		}finally{
			
		}
	}
}

class Son{
	
	public void test2() throws Exception{
		FileReader fr = null;
		fr = new FileReader("d:\\dd.txt");
	}
}