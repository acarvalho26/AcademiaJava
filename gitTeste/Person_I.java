package gitTeste;

/* Person_I class is the superclass 
 * Attributes : name, age
 */
public class Person_I {

	//Attributes
	private String name;
	private int age;
	
	//Behavior - write default constructor. Print 'I'm Person_I constructor'
	
	public Person_I() {
		System.out.println("I'm Person_I constructor");
	}
	
	
	
	//Behavior - write parameterized constructor
	public Person_I(String name, int age) {
		
		this.name = name;
		this.age = age;
	}



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
	
	
	// write getter for String name
	
	
	// write setter for String name
	

	// write getter for int age
	

	// write setter for int age
	
}

