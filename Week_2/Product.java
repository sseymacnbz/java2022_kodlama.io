package oop1;

// Class'lar PascalCase olarak isimlendirilir. Kelimenin ilk harfi büyük olmalıdır.
public class Product {
	// Ürünü tanımlamayız burada. Ürünü tanımlayabilecek ortamı hazırlıyoruz.
	
	// fields
	private String name;
	private double unitPrice;
	private double discount;
	private String imageUrl;
	private int unitsInStock;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public int getUnitsInStock() {
		return unitsInStock;
	}
	public void setUnitsInStock(int unitsInStock) {
		this.unitsInStock = unitsInStock;
	}
	
	
	// private: Sadece kendi class'ından erişilebilir.
	// get-set'ler için bir ayar çekeceğiz.
	
	// sağ tık->Source->Generate Getters and Setters diyip hepsini generate ettik.
	
	// Gerçek hayattan örnek..: Yöneticimiz dedi ki ben artık ürünlere indirim yapmayacağım. Kimse değiştirmesin. Hop hemen setter'i sileriz.
	// Her bir ürün için ayrı ayrı silme işlemi yapmayız.
	
}
