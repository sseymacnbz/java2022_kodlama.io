package javademos;

public class arrayDemo {

	public static void main(String[] args) {
		String ogrenci1 = "Seyma";
		String ogrenci2 = "Semanur";
		String ogrenci3 = "Talha Burak";
		
		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		
		System.out.println("--------------------------------------------");
		
		/* Şayet bizim yukarıdaki örnekteki gibi öğrencilerimiz olsaydı ve biz bunları tutmak isteseydik o halde 
		 * tek tek değişkenlere atamamız gerekecekti. Burada imdadımıza array'ler yetişir. Bunun gibi birden fazla değişkeni
		 * tek bir yapıda tutmayı ve kolayca erişebilmemizi sağlar */
		
		String[] ogrenciler = new String[3]; // 3 elemanlı string bir dizi tanımladık
		
		// Java veya C# gibi diller tip güvenliğini önemsedikleri için dizilerin tipleri de tanımlanmalıdır. Python'da böyle bir durum yoktu.
		
		ogrenciler[0] = "Seyma"; // bir array'deki ilk elemana 0. indexine giderek ulaşırız.
		ogrenciler[1] = "Semanur";
		ogrenciler[2] = "Talha Burak";
	  //ogrenciler[3] = "Ali"; şeklindeki bir durumda hata alırız. Dizinin uzunluğunu arttırarak(mesela burada 4 yaparak) buna çözüm üretebiliriz.
		
		for (int i = 0; i < ogrenciler.length; i++) { // ogrenciler array'inin uzunluğu verir -> length 
			System.out.println(ogrenciler[i]);
		}
		
		System.out.println("--------------------------------------------");
		
		
		// alternatif bir kullanım
		for (String ogrenci:ogrenciler) { // 'Gezeceğimiz array bir String. ogrenciler array'indeki her bir elemanı sırayla gez ve bunu ogrenci'ye ata' anlamındaki bir for döngüsüdür.
			System.out.println(ogrenci);
		}
		

	}

}
