package homework3.entities;

public class Category extends Id implements EntitiesManager{
	
	private String categoryName;
	
	public Category(int id, String categoryName) {
		super(id);
		this.id = id;
		this.categoryName = categoryName;
	}

	public String getcategoryName() {
		return categoryName;
	}

	public void setcategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	
	
}
