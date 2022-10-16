package oopWithNLayeredApp.business;

import java.util.List;

import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.dataAccess.JdbcProductDao;
import oopWithNLayeredApp.dataAccess.ProductDao;
import oopWithNLayeredApp.entities.Product;

public class ProductManager {
	private ProductDao productDao;
	private Logger[] loggers; // Bu kullanım Logger[] loggers kullanımı ile aynıdır. 
	
	public ProductManager(ProductDao productDao, Logger[] loggers) {
		this.productDao = productDao;
		this.loggers = loggers;
	}
	
	// Biz yukarıda bir product manager constructor'u oluşturduk
	// ProductManager her new'lendiğinde bize bir ProductDao verecek ve biz böylece
	// Jdbc mi Hibernate'mi kullanacağız diye düşünmemize gerek kalmayacak

	public void add(Product product) throws Exception {
		// İş kuralları buraya yazılır
		
		if(product.getUnitPrice()< 10) { // Ürünümüzün 10'dan düşük fiyatlı olmaması bir iş kuralıdır mesela.
			throw new Exception("Ürün fiyatı 10'dan küçük olamaz");
		}
		productDao.add(product);
		
		/*
		ProductDao interface'i oluşturmadan önce
		
		JdbcProductDao productDao = new JdbcProductDao();
		productDao.add(product);
		*/
		
		//	ProductDao interface'i oluşturduktan sonra
		
		//ProductDao productDao = new JdbcProductDao();
		//productDao.add(product);

		// Yukarıdaki her 2 kullanım da kötü bir kullanımdır. O yüzden constructor kullanarak bu işi halletik
		// Artık jdbc mi yoksa hibernate mi göndericez ilgilenmiyoruz burda
		
		for (Logger logger : loggers) {
			logger.log(product.getName());
		}
		
	}
}
