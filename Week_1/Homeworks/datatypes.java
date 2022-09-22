package javademos;

public class datatypes {

	public static void main(String[] args) {
		
		int sayi = 12;
	 // sayi = "Ankara";  Bu şekilde bir kullanım yapamayız. integer olarak tanımladığımız değişkene String atamış olduk
	 // int sayi = 12999999999999999912331231231231234234; şeklinde bir tanımlama yaparsak da hata alırız. Integer değerler max 4 byte lık alan tutabilir
		
		
		
		double sayi2 = 12.5; // default olarak ondalıklı sayılarda double kullanılır. 8 byte yer tutar. float da kullanılabilir. float da 4 byte tutar
		
		
		char karakter = 'c'; // tek tırnak kullanılır. Çift tırnakta hata veriyor.
		String sehir = "ANKARA";
		// Bu karakterler de arka planda aslında sayıdır. Ascii karakterleri denir.
		
		boolean dogruMu = true; // şartlı ifadelerde kullanırız.
		
		
		
	}

}
