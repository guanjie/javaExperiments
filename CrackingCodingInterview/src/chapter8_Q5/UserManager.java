package chapter8_Q5;

import java.util.Hashtable;

public class UserManager {
	
	private Hashtable<Integer, User> users;
	
	public User addUser(int id, String details){
		if(users.contains(id)){
			return null;
		}
		User user = new User(id, details);
		users.put(id, user);
		return user;
	}
	
	public boolean remove(User user){
		return remove(user.getID());
	}
	
	public boolean remove(int id){//removing ID from the Hashtable
		if(!users.contains(id)){
			return false;
		}
		users.remove(id);
		return true;
	}
	
	public User find(int id){
		return users.get(id);
	}
}
