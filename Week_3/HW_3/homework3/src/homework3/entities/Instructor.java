package homework3.entities;

public class Instructor extends Id implements EntitiesManager{
	
	private String firstName;
	private String lastName;
	private int age;
	
	public Instructor(int id, String firstName, String lastName, int age) {
		super(id);
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}
