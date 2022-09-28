package javademos;

public class methods2 {

	public static void main(String[] args) {
		
		String mesaj = "Bugun hava cok guzel";
		String yeniMesaj = sehirVer();
		System.out.println(yeniMesaj);
		int sayi = topla(3,5);
		System.out.println(sayi);
		
		int toplam = topla2(2,3,4,5,6,7,8,9);
		System.out.println(toplam);

	}
	
	// void operasyonları birer emir kipi olarak düşünebiliriz. Ondan bir şey yapmamızı isteriz ve o da sadece bu işi yapıp bitirmekle yükümlüdür. Geri dönüt vermez.
	// void dışında int ve String şeklinde tanımlanan metodlarda bir return değeri de eklenmesi gerekir.
	
	public static void ekle() {
		System.out.println("Eklendi");
	}
	
	public static void sil() {
		System.out.println("Silindi");
	}
	
	public static void guncelle() {
		System.out.println("Guncellendi");
	}
	
	public static int topla(int sayi1, int sayi2) {
		return sayi1+sayi2;
	}
	
	public static int topla2(int... sayilar) { // Verilen 3 nokta sanki buraya integer array vermişiz gibi oluyor. Böylece yukarda sadece 2 adet sayı alabilen fonksiyonun aksine istediğimiz kadar sayıyı metoda verebiliriz.
		int toplam = 0; 			     	   // Buna 'variable arguments' denir. Hocamız bunun yerine collections'ları tercih ediyormuş.
		
		for (int sayi:sayilar) {
			toplam += sayi;
		}
		
		return toplam;
	}
	
	public static String sehirVer() {
		return "Ankara";
	}

}
