package chapter8_Q5;

import java.util.HashMap;
import java.util.Hashtable;

public class Library {
	
	private Hashtable<Integer, Book> books;

	public Book addBook(int id, String detail){
		if(books.contains(id)){
			return null;
		}
		Book book = new Book(id, detail);
		books.put(id, book);
		return book;
	}
	
	public boolean remove(Book b){
		return remove(b);
	}
	
	public boolean remove(int id){
		if(!books.containsKey(id)){
			return false;
		}
		books.remove(id);
		return true;
	}
	
	public Book find(int id){
		return books.get(id);
	}	
}
