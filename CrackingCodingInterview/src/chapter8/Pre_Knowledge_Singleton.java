package chapter8;

public class Pre_Knowledge_Singleton {
	
	//Only one _instance, and better yet, it could only be retraced using getInstance method();
	private static Pre_Knowledge_Singleton _instance;
	private Pre_Knowledge_Singleton(){
		
	}
	
	//Only when it's null it will assign new instance and return the new instance, if not null, it will return THE _instance, since there is only one.
	public static Pre_Knowledge_Singleton getInstance(){
		if(_instance == null){
			_instance = new Pre_Knowledge_Singleton();
		}
		return _instance;
	}
	
}
