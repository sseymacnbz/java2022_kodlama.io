package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

// Data Access Object => Dao
public class JdbcProductDao implements ProductDao{ // Sen ProductDao'nun kurallarına uymak zorunda olan bir sınıfsın demiş olduk.
	public void add(Product product) {
		// sadece ve sadece db erişim kodları buraya yazılır
		System.out.println("JDBC ile veritabanına eklendi...");
	}
}
