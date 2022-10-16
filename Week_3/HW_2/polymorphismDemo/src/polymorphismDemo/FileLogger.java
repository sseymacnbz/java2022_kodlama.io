package polymorphismDemo;

public class FileLogger extends BaseLogger{ // Burada bir dosyaya loglama yapacak.
	
	// BaseLogger'daki bu fonksiyonu buraya alarak override etmiş olduk
		public void log(String message) {  
			System.out.println("Logged to file..:" + message);
		}

}
