package abstractClasses;

public abstract class GameCalculator {
	
	// Biz eğer bu hesapla fonksiyonunu diğer class'lar için farklı
	// şekilde işletmek istiyorsak 2 yolumuz var
	// 1) hesapla() yı diğer class'lara da ekleyip onlara göre özelleştirip override edebiliriz
	// 2) abstract yapı kullanabiliriz
	
	// abstract olarak belirttiğimizde GameCalculator hangi class'larda extend edildiyse
	// orada bu hesapla(); fonksiyonunun bulunması zorunlu hale geldi. Interface gibi. Lakin
	// her sınıf yine de kendi hesapla fonksiyonunu yazmak zorundadır.
	public abstract void hesapla();
	
	public final void gameOver() { // override edilmesini istemediğimizden final koyduk
		System.out.println("Oyun bitti");
		
		
	// abstract bir class'ta illa ki abstract bir operasyon olmasına gerek yoktur
	// abtract asla new'lenemez. Bir yerde newlenirse abstract metodu da doldurmalısın der. Zaten bu şekilde abstract bir sınıfı new'lemek doğru değildir 
	}
}
