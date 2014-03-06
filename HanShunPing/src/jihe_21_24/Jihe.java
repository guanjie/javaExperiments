package jihe_21_24;

import java.util.*;

public class Jihe {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList arrayList = new ArrayList();
		System.out.println("al's size is: " + arrayList.size());
		//Putting value into the arraylist: 
		Clerk clerk1 = new Clerk("Eric", 1);
		Clerk clerk2 = new Clerk("Song Jiang", 2);
		Clerk clerk3 = new Clerk("Wu Yong", 3);
		arrayList.add(clerk1);
		arrayList.add(clerk2);
		arrayList.add(clerk3);
		System.out.println(arrayList.size());
		Clerk temp = (Clerk) arrayList.get(1);
		System.out.println(temp.getName());
	}

}



class Clerk{
	private String name;
	private int id;

	public Clerk(String name, int id){
		this.name = name;
		this.id = id;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	

}