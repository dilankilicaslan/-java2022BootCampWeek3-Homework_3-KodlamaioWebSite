package business;

import java.util.List;

import core.logging.Logger;
import dataAccess.CategoryDao;
import dataAccess.CourseDao;
import entities.Category;
import entities.Course;

public class CourseManager {
	private CourseDao courseDao;
	private List<Logger> loggers;
	private List<Course> courseNames;

	public CourseManager(CourseDao courseDao, List<Logger> loggers, List<Course> courseNames) {
		this.courseDao = courseDao;
		this.loggers = loggers;
		this.courseNames = courseNames;

	}
	public void add(Course course) throws Exception {
		 for(Course c : courseNames){
			 if(c.getName() == course.getName()) {
				 System.out.println("Bu kurs daha önce eklenmiştir.");
				 
			 }else {
				 if (course.getPrice() < 0) {

						throw new Exception("Kurs fiyatı 0'dan küçük olamaz!");
					}else {
						 courseDao.add(course);
					}
				
				 
			 }
			 for (Logger logger : loggers) {

					logger.log(course.getName());
				}
		 
			 
		 }
		 if (course.getPrice() < 0) {

				throw new Exception("Kurs fiyatı 0'dan küçük olamaz!");
			}

			

	  }

}
