package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public interface ProductDao {
	void add(Product product);
}

// HiernateDao ve JdbcDao aynı amaca hizmet ediyorlar
// Sistemimizi jdbc'den hibernate'e geçirdiğimizi varsaydık
// Yani burada ProductDao ile ilgili olan alternatifler(yani jdbcProductDao ve HibernateProductDao mesela) void add(Product product) şeklinde
// operasyon içerebilmelidir.