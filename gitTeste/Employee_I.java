package gitTeste;

// class Employee_I must extend class Person_I. Complete code for the same
public class Employee_I extends Person_I  {
	
	//Attributes
	private double salary;
	private String title;
	
	//Behavior - write default constructor. Print 'I'm an Employee_I Constructor'
	
	public Employee_I() {
		System.out.println("I'm Employee_I Constructor");
	}
	
	public Employee_I(double salary, String title) {
		
		this.salary = salary;
		this.title = title;
		
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	
	
	// write getter for int salary
	
	
	// write setter for int salary
	
	
	// write getter for String title
	
	
	// write setter for String title
	
}
