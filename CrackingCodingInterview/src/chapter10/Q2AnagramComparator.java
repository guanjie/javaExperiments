package chapter10;

import java.util.Arrays;
import java.util.Comparator;

public class Q2AnagramComparator implements Comparator<String>{

	public static String sortString(String str1){
		char[] chars1 = str1.toCharArray();		
		Arrays.sort(chars1);
		return new String(chars1);
	}
	
	//This part for self-study purpose
	public static boolean isAnagram(String str1, String str2){
		String string1 = sortString(str1);
		String string2 = sortString(str2);
		return sortString(str1).equals(sortString(str2));
	}

	@Override
	public int compare(String arg0, String arg1) {
		// TODO Auto-generated method stub
		return sortString(arg0).compareTo(sortString(arg1));
	}
}
