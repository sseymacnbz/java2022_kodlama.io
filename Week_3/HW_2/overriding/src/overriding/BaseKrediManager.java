package overriding;

public class BaseKrediManager {
	public double hesapla(double tutar) {
		return tutar * 1.18;
	}
	
	// Eğer bir operasyonun asla override edilebilir olsun istemezsek aşağıdaki şekilde kullanırız
	
	/*
	    public final double hesapla(double tutar) {
			return tutar * 1.18;
		}
	 
	 * Böyle bir kullanm sonucunda OgrenciKrediManager'da override ettiğimiz hesapla fonksiyonunun altı kırmızı çizilir ve hata verilir.
	 */
}
