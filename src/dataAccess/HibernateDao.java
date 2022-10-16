package dataAccess;

import entities.Category;
import entities.Course;

public class HibernateDao implements CourseDao,CategoryDao {

	@Override
	public void add(Category category) {
		System.out.println("Hibernate ile veritabanina eklendi");
	}

	@Override
	public void add(Course course) {
		System.out.println("Hibernate ile veritabanina eklendi");
	}

	
}
