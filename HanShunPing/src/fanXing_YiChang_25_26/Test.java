package fanXing_YiChang_25_26;
import java.lang.reflect.Method;
import java.util.ArrayList;


//FanXing
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Dog> arrayList = new ArrayList<Dog>();
		//Create a dog:
		Dog dog = new Dog();
		arrayList.add(dog);
		//Retrieve the dog:
		Dog temp = arrayList.get(0);//qu chulai jiu shi dog.
		
		Gen<Bird> gen1 = new Gen<Bird>(new Bird());
		gen1.showTypeName();
		
	}

}

class Bird{
	public void test1(){
		System.out.println("aa");
	}
	
	public void count(int a, int b){
		System.out.println(a+b);
	}
}


class Gen<T>{
	private T o;
	
	public Gen(T t){
		this.o = t;
	}
	
	public void showTypeName(){
		System.out.println("Type is: " + o.getClass());
		//Reflection, we could get lots of Info about T: 
		Method[] methods = o.getClass().getDeclaredMethods();
		for(int i = 0; i < methods.length; i++){
			System.out.println(methods[i].getName());
		}
		
		
		
		
		
		
	}
}




class Cat{
	private int age;
	private String color;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
}

class Dog{
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}