package classesWithAttributes;

public class ProductManager {
	
	public void Add(Product product) {
		System.out.println("Urun eklendi...: " + product.name);
	}
	
	// Bu yanlış bir kullanımdır.
	public void Add2(int id, String name, String description, int stockAmount, double price) {
		
	}
	// Main'de productManager.Add2() diyip field'ları girdiğimizde, price'ın yanina yeni bir özellik eklenirse
	// Add2'yi kullanan tüm sistemler hata verecekti sen bana yeni özelliği eklemedin diye.
}
