package staticDemo;

public class Main {

	public static void main(String[] args) {
		ProductManager manager = new ProductManager();
		Product product = new Product();
		
		product.price = 10;
		product.name = "Mouse"; 
		
		manager.add(product);
		
		// Bir metodu static yaptığımızda class ismiyle direkt çağırabiliriz
		// Utility gibi dosyalar içerisinde kullanılmak içindir bu durum.
		
		
		
		// Çok doğru bir kullanım olmasa da bu da vardır
		DatabaseHelper.Crud.Delete();
		DatabaseHelper.Connection.createConnection(); // inner class
		
		
		
		
	}

}
