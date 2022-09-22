package intro;

public class Main {
	
	// disable spell checking yaparak türkçe yorum satırlarının altındaki kırmızı çizgi kalktı
	// main javada başlangıç noktasıdır
	public static void main(String[] args) {
		System.out.println("Hello World !"); // Ctrl + Space info box gibi bir şey çıkartıyor. Burada tek tırnak hata veriyor
		// sysout yazıp ctrl + space yapınca da direkt println ı tamamlıyor
		
		// değişken isimledirmeleri java'da camelCase yazılır. Yani ilk harf küçük sonraki kelimelerinki büyük olmalı
		String ortaMetin = "İlginizi çekebilir";
		String altMetin = "Vade süresi";
		
		System.out.println(ortaMetin);
		
		// integer
		int vade = 12;
		
		//double
		double dolarDun = 18.14;
		double dolarBugun = 18.10;
		
		// long da kullanılabilir
		
		boolean dolarDustuMu = true; // false
		
		String okYonu = "";
		
		if (dolarBugun < dolarDun) {
			okYonu = "down.svg";
			System.out.println(okYonu);
			
		} 
		
		else if (dolarBugun > dolarDun) {
			okYonu = "up.svg";
			System.out.println(okYonu);
		}
		
		else {
			okYonu = "equal.svg";
			System.out.println(okYonu);
		}
		
		
		// array
		String[] krediler = {"Hizli Kredi", "Maasini Halkbak'tan Alanlar", "Mutlu Emekli"};
		
		System.out.println(krediler[0]);
		
		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
		}
		
		
		
	}

}
