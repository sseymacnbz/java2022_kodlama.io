package overriding;

public class Main {

	public static void main(String[] args) {
		//OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
		//System.out.println(ogretmenKrediManager.hesapla(1000));
		
		BaseKrediManager[] krediManagers = new BaseKrediManager[] 
				{new OgretmenKrediManager(), new TarimKrediManager(), new OgrenciKrediManager()};
		
		for (BaseKrediManager krediManager: krediManagers) {
			krediManager.hesapla(1000); // Bunu giridiğimiz kredi türlerimiz için tek tek hesaplar. Bu polimorfizm
		}
	}

}
