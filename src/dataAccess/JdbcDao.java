package dataAccess;

import entities.Category;
import entities.Course;

public class JdbcDao implements CourseDao,CategoryDao {

	@Override
	public void add(Category category) {
		 System.out.println("JDBC ile veritabanina eklendi");
		
	}

	@Override
	public void add(Course course) {
		 System.out.println("JDBC ile veritabanina eklendi");
		
	}
	

	
}
