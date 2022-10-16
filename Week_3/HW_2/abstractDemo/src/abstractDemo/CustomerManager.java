package abstractDemo;

public class CustomerManager {
	
	BaseDatabaseManager databaseManager;
	
	// Biz databaseManager'e hangi db'i verirsek burada da o çalışacak artık
	
	public void getCustomers() {
		/*OracleDatabaseManager oracleDatabaseManager = new OracleDatabaseManager();
		oracleDatabaseManager.getData();*/
		// Yukarıdaki hatalı bir kullanımdır
		// Programımızı bağımlı bir hale getirdik çünkü
		
		databaseManager.getData();
	}
}
