package methodOverloading;

public class DortIslem {
	public int topla(int sayi1, int sayi2) {
		return sayi1 + sayi2;
	}
	
	// metod overloading. 3 sayıyı toplayan yeni bir fonksiyon oluşturmak yerine, aynı fonksiyonun adında parametreleri değiştirdik.
	public int topla(int sayi1, int sayi2, int sayi3) {
		return sayi1 + sayi2 + sayi3;
	}
}
