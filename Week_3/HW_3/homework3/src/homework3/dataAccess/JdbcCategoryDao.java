package homework3.dataAccess;

public class JdbcCategoryDao implements CategoryDao{

	@Override
	public void add() {
		System.out.println("Jdbc ile 'Category' Tablosuna eklendi...");
		
	}

}
