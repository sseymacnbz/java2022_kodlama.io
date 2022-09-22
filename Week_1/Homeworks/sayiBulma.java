package javademos;

public class sayiBulma {

	public static void main(String[] args) {
		int[] sayilar = new int[] {1,2,5,7,9,0};
		int aranacak = 5;
		
		// Kendi Çözümüm
		
		boolean varMi = false;
		for (int num:sayilar) {
			if(num == aranacak) {
				varMi = true;
				break;
			}
		}
		
		if(varMi) {
			System.out.println("Bu sayi dizi icerisinde vardir");
		}
		else {
			System.out.println("Bu sayi dizi icerisinde yoktur.");
		}
		
		
		
		// Hocanın Çözümü
		// Benim çözümüm ile aynı olduğundan eklemedim

	}

}
