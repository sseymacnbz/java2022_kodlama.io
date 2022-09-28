package oop1;

public class IndividualCustomer extends Customer { // Individual Customer, bireysel müşterilerdir. Customer'daki özellikleri de buraya ekledik. Çünkü Indıvıdual da olsa o bir customer'dır
	private String firstName;
	private String lastName;
	
	
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
	
	
	
}
