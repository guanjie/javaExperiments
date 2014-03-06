package chapter8_Q5;

public class User {
	
	private int userID;
	private String details;
	
	public User(int id, String description){
		this.userID = id;
		this.details = description;
	}
	
	public int getID(){
		return this.userID;
	}
	
	public void setID(int id){
		this.userID = id;
	}
	
	public String getDetails(){
		return this.details;
	}
	
	public void setDetails(String str){
		this.details = str;
	}
	
}
