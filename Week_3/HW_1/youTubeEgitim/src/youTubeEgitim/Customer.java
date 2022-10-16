package youTubeEgitim;

public class Customer {
	
	// SOLID : Yazılım geliştirme prensipleri
	// Bir class sadece bir iş yapabilir
	// Özellik tutan bir class'a bir de metod eklemek olmaz
	
	// fields
	public int id;
	public String city;
	
	// Constructor
	public Customer() {
		System.out.println("Musteri nesnesi baslatildi...");
		
		// Bu kisim new Customer();'ı görüldüğü an 1 kez çalıştırılır.
		// Her new'leme işleminde bu kısım çalışır
	}
	
	
	
}
