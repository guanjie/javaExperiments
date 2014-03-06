package jihe_21_24;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;


/*
 * 
 * ArrayList Knowledge: 
 */


public class Demo_7_1 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		EmployeeManage em = new EmployeeManage();
		
		BufferedReader br = new BufferedReader(null);
		
		while(true){
			System.out.println("Adding a new employee:");
			System.out.println("1: Printing adding a new employee: ");
			System.out.println("2: Search for a new employee: ");
			System.out.println("3: Change an employee's salary: ");
			System.out.println("4: Deleting an employee: ");

			String operType = br.readLine();

			if(operType.equals("1")){
				System.out.println("Please print ID: ");
				String empNo = br.readLine();
				System.out.println("Please print name: ");
				String name = br.readLine();
				System.out.println("Please print sal: ");
				float sal = Float.parseFloat(br.readLine());
				
				Employee emp = new Employee(empNo, name, sal);
				
				em.addEmployee(emp);
			}
		}
	}
}

//Which is true: thereafter from here. Life is awesome, and you know what, this is actually really cool.

class EmployeeManage{
	
	private ArrayList arrayList = null;
	
	public EmployeeManage(){
		arrayList = new ArrayList();
	}
	
	public void addEmployee(Employee emp){
		arrayList.add(emp);
	}
	
	public void showInfo(int empNo){
		//Go through the ArrayList: 
		for(int i = 0; i < arrayList.size(); i++){
			Employee emp = (Employee) arrayList.get(i);
			if(emp.getEmpNo().equals(empNo)){
				System.out.println("A bunch of Info here and there");
			}
		}
	}
	
	public void updateSal(String empNo, float newSal){
		
	}
}





class Employee{
	private String empNo;
	private String name;
	private float sal;
	
	public Employee(String empNo, String name, float sal){
		this.empNo = empNo;
		this.name = name;
		this.sal = sal;
	}
	
	public String getEmpNo() {
		return empNo;
	}

	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getSal() {
		return sal;
	}

	public void setSal(float sal) {
		this.sal = sal;
	}
}