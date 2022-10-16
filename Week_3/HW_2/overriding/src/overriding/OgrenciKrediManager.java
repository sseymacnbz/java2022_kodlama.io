package overriding;

public class OgrenciKrediManager extends BaseKrediManager{
	// Devlet desin ki öğrencilere verilecek kredi faizi tutarı 1.18 değil de 1.10 olacak desin.
	// Bu işlemimiz ile Base'in hesapla fonksiyonunu OgrenciKredi için ezmiş olduk.
	// Buna overriding denir işte.
	
	public double hesapla(double tutar) {
		return tutar * 1.10;
	}

}
