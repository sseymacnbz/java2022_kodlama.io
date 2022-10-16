package staticDemo;

public class ProductManager {
	public void add(Product product) {
		ProductValidator validator = new ProductValidator();
		
		//if (validator.isValid(product)) {
		if (ProductValidator.isValid(product)) {
			System.out.println("VT'ye eklendi...");
		}
		else {
			System.out.println("Ürün bilgileri geçersizdir");
		}
		
	}
	
	public void bisey() {
		
	}
}
