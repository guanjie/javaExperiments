package chapter10;

//This is actually brute force solution for question 5. Getting the index of a particular string out of a string array.
public class Q4 {

	public static int findLocation(String[] strs,String str){
		for(int i=0; i < strs.length; i++){
			if (strs[i]==str){
				return i;
			}
		}
		return -1;
	}
}
