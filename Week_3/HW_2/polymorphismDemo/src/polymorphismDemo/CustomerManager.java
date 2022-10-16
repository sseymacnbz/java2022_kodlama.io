package polymorphismDemo;

public class CustomerManager {
	
	private BaseLogger logger;
	
	public CustomerManager(BaseLogger logger) { // Bir constructor oluşturuyoruz. CustmerManager her new'lendiğinde burası çalışacak
		this.logger = logger; 
	}
	
	public void add() {
		System.out.println("Musteri eklendi...");
		this.logger.log("Log mesaji");
		
		/* 
		 * Gerçek hayatta db'e bir müşteri eklendiğinde kim, ne zaman ekledi gibi loglar tutulur.
		 * Aşağıda da bir database'e loglama işlemi var.
		 * Biz aslında bir class'ın içinde öbür class'ı new'lerken biraz korkmalyız
		 * Yarın öbür gün yönetici dese ki artık db'e değil file'lara loglama yapılacak,
		 * Böyle bir durumda aşağıdaki gibi bir kullanım çok tehlikeli olacak
		 * Bu yüzden de yorum satrı olmayan durum gib bir senaryonun kullanılması daha iyi olacaktır
		
		DatabaseLogger logger = new DatabaseLogger();
		logger.Log("Log mesajı");
		
		*/
		
		
		// Yukarıdaki constructor sonucunda Main'deki for
		
		
	}
}
