package inheritanceDemo;
// Bu class bir arayüz. Yani burada butonlar, textBox'lar vs kullanılacak olan class olsun.
public class KrediUI {
	/*
	public void KrediHesapla(OgretmenKrediManager ogretmenKrediManager) {
		ogretmenKrediManager.Hesapla();
	}
	Biz bu şekilde yaparsak her seferinde yeni bir kredi kampanyası yapıldığında ayrı ayrı onlara fonk. yapmamız gerekir. Bunun yerine aşağıdaki işlemi yaparız
	*/
	
	public void KrediHesapla(BaseKrediManager baseKrediManager) {
		baseKrediManager.Hesapla();
	}
}
