package homework3.business;

import java.util.ArrayList;
import java.util.List;

import homework3.core.logging.Logger;
import homework3.dataAccess.CategoryDao;
import homework3.entities.Category;

public class CategoryManager {
	
	private CategoryDao categoryDao;
	private List<String> categories=new ArrayList<>();
	private Logger[] loggers;
	
	public CategoryManager(CategoryDao categoryDao, Logger[] loggers) {
		this.categoryDao = categoryDao;
		this.loggers = loggers;
	}
	
	
	public void addCategory(Category category) throws Exception{
		if(categories.contains(category.getcategoryName())) {
			throw new Exception("HATA! Aynı isimde kategori veri tabanında bulunmaktadır...");
		}
		
		categoryDao.add();
		categories.add(category.getcategoryName());
		
		for (Logger logger : loggers) {
			logger.log();
		}
	}
}
