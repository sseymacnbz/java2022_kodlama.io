package homework3.dataAccess;

public class HibernateCategoryDao implements CategoryDao{

	@Override
	public void add() {
		System.out.println("Hibernate ile 'Category' Tablosuna eklendi...");
		
	}

}
