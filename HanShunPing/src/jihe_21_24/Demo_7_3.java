package jihe_21_24;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;


/*
 * LinkedList Knowledge
 * Vector Knowledge
 * Stack Knowledge
 * HashMap
 * Hashtable
 */
public class Demo_7_3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ll = new LinkedList();
		Employee emp1 = new Employee("sa01","aa",1.2f);
		Employee emp2 = new Employee("sa01","bb",1.2f);
		ll.addFirst(emp1);
		ll.addFirst(emp2);
		for(int i = 0; i < ll.size(); i++){
			System.out.println(((Employee)ll.get(i)).getName());
		}
		
		//Vector Utility:
		Vector vv = new Vector();
		Employee emp11 = new Employee("1","aa",1.2f);
		vv.add(emp11);
		
		for(int i = 0; i < vv.size(); i++){
			Employee emp = (Employee)vv.get(i);
		}
		
		//Stack Utility:
		Stack stack = new Stack();
		
		//Hashmap: 
		HashMap map = new HashMap();
		
		Employee emp21 = new Employee("s001", "aaa", 3.4f);
		Employee emp22 = new Employee("s002", "huangRong", 5.6f);
		Employee emp23 = new Employee("s003", "liKui", 1.2f);
		//put emp into the map
		map.put("s001", emp21);
		map.put("s002", emp22);
		map.put("s001", emp23);
		
		//if you want to check s002:
		if(map.containsKey("s001")){
			System.out.println("found it!");
			Employee temp = (Employee) map.get("s001");
			System.out.println(temp.getName());
		} else {
			System.out.println("Didn't find it.");
		}
		System.out.println();
		
		Iterator it = map.keySet().iterator();
		while(it.hasNext()){
			String key = (String) it.next();
			Employee emp = (Employee) map.get(key);
			System.out.println(emp.getName());
			System.out.println(emp.getEmpNo());
		}
		
		
	}
}
