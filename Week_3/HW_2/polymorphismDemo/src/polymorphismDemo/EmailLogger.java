package polymorphismDemo;

public class EmailLogger extends BaseLogger{ // Bir email'e loglama yapacak
	
	// BaseLogger'daki bu fonksiyonu buraya alarak  override etmiş olduk
		public void log(String message) {  
			System.out.println("Logged to email..:" + message);
		}
		
		
	// Bazen default loglama dışında email veya file vs. için ayrı bir durum oluşturmak isteriz. O zaman da fonksiyonu override ederek aynı fonksiyonu başka bir amaç için kullanabiliriz.

}
