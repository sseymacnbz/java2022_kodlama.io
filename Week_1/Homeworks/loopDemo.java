package javademos;

public class loopDemo {

	public static void main(String[] args) {
		
		// For
		for(int i = 1; i < 10; i+=2) {
			System.out.println(i);
		}
		System.out.println("For Dongusu Bitti");
		
		
		int i = 1;
		// While
		while(i<10) {
			System.out.println(i);
			i++; 		//i++ koymazsak infinite (sonsuz) loop durumu gerçekleşir. 
		}
		System.out.println("For Dongusu Bitti");
		
		
		// Do-While
		int j = 1;
		
		do {
			System.out.println(j);
			j+=2;
		}while(j<10);
		System.out.println("Do-While Dongusu Bitti");

		
		// Do-While'ın While'dan farkı şart sağlanmasa dahi 1 kez de olsa döngüye girer. Önce 'do' kısmı işletildiğinden dolayı bu işlem gerçekleşir
	}

}
