package staticDemo;

public class ProductValidator {
	
	static {
		System.out.println("Statik yapıcı blok çalıştı");
	}
	
	
	public ProductValidator(){
		System.out.println("Yapıcı blok çalıştı");
	}
	
	
	public static boolean isValid(Product product) {
		if(product.price > 0 && !product.name.isEmpty()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void bisey() {
		
	}
	
	// newlenme durumunda cosntructor çalışırken static metodlar newlenmediğinden
	// bunun için de bir static ismiyle constructor oluşturabiliriz
	
}
