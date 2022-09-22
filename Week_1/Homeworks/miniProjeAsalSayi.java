package javademos;

public class miniProjeAsalSayi {

	public static void main(String[] args) {
		int number = 3;
		int remainder = number % 2; // '%' sayının 2'ye bölümünden kalanı verecektir 
		
		
		// Kendi çözümüm
		
		/*
		remainder = 0;
		for(int i = number-1; i>1; i--) {
			if (number % i == 0) {
				remainder = 1;
				break;
			}
		}
		
		
		if (remainder == 0) {
			System.out.println(number+" bir asal sayidir");
		}
		else {
			System.out.println(number+ " bir asal sayi degildir.");
		}
		*/
		
		
		
		// Hocanın çözümü
		
		boolean isPrime = true;
		
		if(number==1) { 
			System.out.println("Sayi asal degildir"); 
			return; 
		}
		
		if (number<1) System.out.println("Gecersiz sayi");
		
		for (int i = 2; i < number; i++) {
			if (number % 2 == 0) {
				isPrime = false;
			}
		}
		
		if (isPrime) {
			System.out.println("Sayi asaldir");
		}
		else {
			System.out.println("Sayi asal degildir");
		}
		
		
		// Biz burada sayi yerine 1 girersek burada hatalı bir geri dönüt alırız. Bu bug'ı engelemek için de 1'i ayrıca değerlendirdik
		
		
	}

}
