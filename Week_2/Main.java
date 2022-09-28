package oop1;

public class Main {

	public static void main(String[] args) {
		// OOP => Object Oriented Programming
		
		String mesaj = "Vade orani";
	/*
		Product product1 = new Product();
		// set					Burada yapılan işlemlere set denir. Değerleri atadık
		product1.name = "Delonghi Kahve Makinesi";
		product1.unitPrice = 7500;
		product1.discount = 7;
		product1.unitsInStock = 3;
		product1.imageUrl = "bilmemne1.jpg";
		
		
		// get					Burada yapılan işleme get denir. Değerlere eriştik.
		//System.out.println(product1.name);
		
		
		Product product2 = new Product();
		product2.name = "Smeg Kahve Makinesi";
		product2.unitPrice = 6500;
		product2.discount = 8;
		product2.unitsInStock = 2;
		product2.imageUrl = "bilmemne2.jpg";
		
		
		Product product3 = new Product();
		product3.name = "Kitchen Aid Kahve Makinesi";
		product3.unitPrice = 4500;
		product3.discount = 9;
		product3.unitsInStock = 4;
		product3.imageUrl = "bilmemne3.jpg";
		
		
		Product[] products = {product1, product2, product3}; // Buraya herhangi bir string veya int veremeyiz. Vereceğimiz şeyler Product tipinde olmalı
		
		System.out.println("<ul>");
		for(Product product: products) {
			System.out.println("<li>" + product.name + "</li>");
		}
		System.out.println("</ul>");
		
		Burada private işleminden sonra hata verdi. Silmedim, yoruma aldım.
	*/
		
		
		
		Product product1 = new Product();
		product1.setName("Delonghi Kahve Makinesi");
		product1.setDiscount(7);
		product1.setUnitPrice(7500);
		product1.setUnitsInStock(3);
		product1.setImageUrl("image1.jpg");
		
		Product product2 = new Product();
		product2.setName("Smeg Kahve Makinesi");
		product2.setDiscount(3);
		product2.setUnitPrice(6500);
		product2.setUnitsInStock(8);
		product2.setImageUrl("image2.jpg");
		
		Product product3 = new Product();
		product3.setName("Kitchen Aid Kahve Makinesi");
		product3.setDiscount(4);
		product3.setUnitPrice(9500);
		product3.setUnitsInStock(6);
		product3.setImageUrl("image3.jpg");
		
		
		Product[] products = {product1, product2, product3};
		
		
		System.out.println("<ul>");
		for(Product product: products) {
			System.out.println("<li>" + product.getName() + "</li>");
		}
		System.out.println("</ul>");
		
		
		IndividualCustomer individualCustomer = new IndividualCustomer();
		
		individualCustomer.setId(1);
		individualCustomer.setPhone("05222222222");
		individualCustomer.setCustomerNumber("12345");
		individualCustomer.setFirstName("Seyma");
		individualCustomer.setLastName("Canbaz");
		
		
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		
		corporateCustomer.setId(2);
		corporateCustomer.setCompanyName("Kodlama.io");
		corporateCustomer.setPhone("053333333333");
		corporateCustomer.setTaxNumber("1111111111");
		corporateCustomer.setCustomerNumber("54321");
		
		
		Customer[] customers = {individualCustomer, corporateCustomer};
		
		
		
		
		
		
		
		
		
		
		
	}

	
}

