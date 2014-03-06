package chapter8_Q5;

public class Book {

	private int bookID;
	private String details;
	
	public Book(int id, String description){
		bookID = id;
		details = description;
	}
	
	public int getID(){
		return bookID;
	}
	
	public void setID(int id){
		bookID = id;
	}
	
	public String getDetails(){
		return details;
	}
	
	public void setDetails(String detail){
		details = detail;
	}
	
}
