package javademos;

public class mukemmelSayi {

	public static void main(String[] args) {
		// Kendinden başka pozitif tam bölenlerinin toplamı kendini veren sayılara mükemmel sayı denir.
		// Ör: 6'nın tam bölenleri = 1,2,3 . Bunların toplamı..: 1+2+3 = 6
		// Ör: 28'in tam bölenleri = 1,2,4,7,14. Toplamları = 28
		
		
		// Kendi Çözümüm
		/*
		int number = 5;
		int sum = 0;
		
		for (int i = 1; i < number; i++) {
			if(number % i == 0) {
				sum = sum + i;
			}
		}
		
		
		if(number == sum) System.out.println(number+ " bir mukemmel sayidir.");
		else System.out.println(number+ " bir mukemmel sayi degildir");
		*/
		
		
		// Hocanın Çözümü
		int number = 5;
		int total = 0;
		
		for(int i = 1; i < number; i++) {
			if (number % i == 0) {
				total = total + i;
			}
		}
		
		
		if (total == number) {
			System.out.println("Mukemmel Sayidir");
		}
		else {
			System.out.println("Mukemmel Sayi Degildir");
		}
		
		
		
	}

}
