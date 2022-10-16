package polymorphismDemo;

public class DatabaseLogger extends BaseLogger{	// Loglar burada database'e aktarılacak.
	
	// BaseLogger'daki bu fonksiyonu buraya alarak  override etmiş olduk
	public void log(String message) {  
		System.out.println("Logged to database..:" + message);
	}
}
