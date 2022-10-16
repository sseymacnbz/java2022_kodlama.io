package youTubeEgitim;

public class CustomerManager {
	
	private Customer customer;
	private ICreditManager creditManager;
	
	public CustomerManager(Customer customer, ICreditManager creditManager) {
		this.customer = customer;
		this.creditManager = creditManager;
		// Interface'ler referans tipli olduğundan bu şekilde creditManager'ın tipini interface olarak belirledik
	}
	
	
	public void save() {
		System.out.println("Musteri kaydedildi..." + customer);
	}
	
	public void delete() {
		System.out.println("Musteri silindi..." + customer);
	}
	
	// Bu şekilde constructor ile customer'ları birbirine eşitlememizin sebebi
	// save() içerisinde de buna eişebilir olmak istememizdir.
	
	
	/*
	public void save(Customer customer) {
		System.out.println("Musteri kaydedildi...");
	}
	*/
	
	
	// INTERFACE KISMI
	
	public void giveCredit() {
		creditManager.calculate();
		System.out.println("Kredi verildi");
	}
	
}
