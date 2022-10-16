package kodlamaioWebSite;

import java.util.ArrayList;
import java.util.List;

import business.CategoryManager;
import business.CourseManager;
import core.logging.DatabaseLogger;
import core.logging.FileLogger;
import core.logging.Logger;
import dataAccess.HibernateDao;
import dataAccess.JdbcDao;
import entities.Category;
import entities.Course;

public class Main {

	public static void main(String[] args) throws Exception {
		List<Logger> loggers = new ArrayList<Logger>();
		loggers.add(new FileLogger());
		loggers.add(new DatabaseLogger());
		//Category add
		System.out.println("KATEGORİ EKLEME KISMI");
		System.out.println("---------------------");
		Category category1 = new Category();
		category1.setId(1);
		category1.setName("Java");
		
		Category category2= new Category();
		category2.setId(2);
		category2.setName("Yazılım");
		
		List<Category> categories = new ArrayList<Category>();
		categories.add(category1);
		
		
		CategoryManager categoryManager = new CategoryManager(new HibernateDao(), loggers, categories);
		categoryManager.add(category1);
		System.out.println("KURS EKLEME KISMI");
		System.out.println("---------------------");
		// course add
		Course course1 = new Course();
		course1.setId(1);
		course1.setName("2022  JAVA ");
		course1.setPrice(60);
		
		Course course2 = new Course();
		course2.setId(1);
		course2.setName("2022  SQL EĞİTİMİ ");
		course2.setPrice(0);
		
		List<Course> courses = new ArrayList<Course>();
		courses.add(course1);
		courses.add(course2);
		
		CourseManager courseManager = new CourseManager(new JdbcDao(),loggers,courses);
		courseManager.add(course2);

	}

}
