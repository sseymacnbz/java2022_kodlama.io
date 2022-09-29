package inheritanceDemo;
// Not: Bir class sadece başka 1 tane class'ı inherit edebilir. 2 tane veya daha fazlasını miras alamaz
public class Main {

	public static void main(String[] args) {
		//OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
		//TarimKrediManager tarimKrediManager = new TarimKrediManager();
		
		//ogretmenKrediManager.Hesapla();

		
		KrediUI krediUI = new KrediUI();
		krediUI.KrediHesapla(new OgretmenKrediManager()); // Böylelikle OgretmenKrediManager'da bulunan kredi hesaplamayı krediUI'a aktardık
		
		// KrediUI daki değişiklik, yukarıdaki kodda değişiklik yapmamızı gerektirmez. Çünkü BaseKrediManager bir annedir ve çocuğunu gönderiyordur gibi düşünebiliriz
		
		krediUI.KrediHesapla(new AskerKrediManager());
	}

}
