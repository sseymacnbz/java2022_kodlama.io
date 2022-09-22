package javademos;

public class stringsDemo {

	public static void main(String[] args) {
		String mesaj = "Bugun hava cok guzel."; // stringler birer karakter dizisidir aslında. 
		
		System.out.println(mesaj);
		
		System.out.println("Eleman sayısı..: " +mesaj.length()); // dizinin eleman sayısını verir.
		System.out.println("5. eleman..: " +mesaj.charAt(4)); // 4.indexteki elemanı getirir.
		System.out.println(mesaj.concat(" Yasasın!")); // Bir birleştirme işlemi yapar.
		System.out.println(mesaj.startsWith("B")); // 'B' ile başlarsa true, başlamazsa false döner.
		System.out.println(mesaj.endsWith(".")); // '.' ile biterse true, bitmezse false döner.
		
		char[] karakterler = new char[5];
		mesaj.getChars(0, 4, karakterler, 0); // mesaj stringindeki 0'dan 4'e kadar(4 hariç yani) olan indexteki karakterleri, 'karakterler' array'ine aktar. Bu arrayda atamaya da 0. indexten başla (arrayimiz daha büyük olursa atıyorum 10. indexten itibaren de atamaya başlayabiliridk)
		System.out.println(karakterler);
		
		System.out.println(mesaj.indexOf('a')); // verilen elemanın kaçıncı indexte bulunduğunu döner. İlk bulduğunun konumunu verir. Bir string de versek stringin hangi indexten itibaren başladığını döner
		System.out.println(mesaj.lastIndexOf("e")); // arama işlemini sağdan (yani sondan) başlatır.
		
		
		
		System.out.println(mesaj.replace(' ', '-')); // Metindeki istediğimiz karakterleri başka bir karakterle değiştirmemizi sağlar. Boşlukları - ile değiştirecektir.
		System.out.println(mesaj.substring(2)); // Bir metinden parça almamızı sağlar. 2.indexten itibaren mesajın geri kalanını alır.
		System.out.println(mesaj.substring(2, 4)); // 2.index dahil, 4.index hariç karakterleri alır.
		 
		
		for (String kelime:mesaj.split(" ")) {// Bir metni belirli bir karaktere göre ayırmayı sağlar ve bunu da bize dizi olarak verir.
			System.out.println(kelime);
		}
		
		
		System.out.println(mesaj.toLowerCase()); // String'deki tüm harfleri küçültür.
		System.out.println(mesaj.toUpperCase()); // String'deki tüm harfleri büyültür.
		
		
		
		String mesaj2 = "     Bugun hava cok guzel.       ";
		System.out.println(mesaj2.trim()); // String'in başta ve sondaki boşlukları temizler.
		

	}

}
