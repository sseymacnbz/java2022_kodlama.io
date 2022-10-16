package youTubeEgitim;

public class Main2 {

	public static void main(String[] args) {
		// INTERFACE
		// İş yapan sınıfların operasyonlarının (Ör: CreditManager içerisindeki bir operasyon olabilir)
		// sadece imza seviyesinde yazarak yazılımda bağımlılığı korumak adına oluşturulmasıdır
		
		CustomerManager customerManager = new CustomerManager(new Customer(), new MilitaryCreditManager());
		customerManager.giveCredit();
		
		// Bir sınıf birden fazla interface'i implemente edebilir
		// Bir sınıf sadece bir sınıfı inherit edebilir
		
		
		// ABSTRACT CLASS
		// Bunlar bizim için ortak sınıfları tutarlar
		// Interface kullanırken aynı metodları farklı içerikte yazmıştık
		// Ama bazen olur ki orada bazı metodların görevleri yine de aynıdır
		// Abstract Class'larda da bu 2 türü bir arada tutabilmemizi sağlar
		// Base Credit Manager bir örnektir. (İçeriğine bak)
		
		// Bir sınıf sadece bir abstract sınıfı inherit edebilir.
		 

	}

}
