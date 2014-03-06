package chapter17;

import java.util.Hashtable;

public class Q9 {
	
	Hashtable<String, Integer> findFrequency(String[] book){
		Hashtable<String, Integer>table = new Hashtable<String, Integer>();
		for(String str:book) {
			str = str.toLowerCase();
			if(!table.contains(str)){
				table.put(str, 1);
			} else {
				table.put(str, table.get(str)+1);
			}
		}
		return table;
	}
	
	public int getFrequency(Hashtable<String, Integer> table, String str){
		str = str.toLowerCase();
		if(!table.isEmpty()){
			if(table.contains(str)){
				return table.get(str);
			} else return 0;
		}
		return 0;
	}

}
