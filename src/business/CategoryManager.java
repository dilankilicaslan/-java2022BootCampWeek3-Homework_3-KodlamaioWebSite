package business;

import java.util.ArrayList;
import java.util.List;

import core.logging.Logger;
import dataAccess.CategoryDao;
import entities.Category;

public class CategoryManager {
	 private CategoryDao categoryDao;
     private List<Logger> loggers;
	 private List<Category> categories ;
	 public CategoryManager(CategoryDao categoryDao, List<Logger> loggers,List<Category> categories) {
	        this.categoryDao = categoryDao;
	        this.loggers = loggers;
	        this.categories = categories;
	        
	  }
	  public void add(Category category) throws Exception {
		 for(Category c : categories){
			 if(c.getName() == category.getName()) {
				 System.out.println("Bu kategori daha önce eklenmiştir.");
				 
			 }else {
				 System.out.println("Kategori eklendi");
				 categoryDao.add(category);
				 
			 }
			 for (Logger logger : loggers) {

					logger.log(category.getName());
				}
		 
			 
		 }

			

	  }
}
