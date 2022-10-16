package interfaces;
// I -> Interface
// Dal -> Data Access Layer, Veri tabanı aksiyonları buralara yazılır
public interface ICustomerDal {
	// Interface sadece bir referans tutucudur, class değildir
	
	void add();
}
