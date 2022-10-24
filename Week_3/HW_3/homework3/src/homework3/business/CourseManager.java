package homework3.business;

import homework3.core.logging.Logger;
import homework3.dataAccess.CourseDao;
import homework3.entities.Course;

import java.util.ArrayList;
import java.util.List;

public class CourseManager {
	
	private CourseDao courseDao;
	private List<String> courses=new ArrayList<>();
	private Logger[] loggers;
	
	public CourseManager(CourseDao courseDao, Logger[] loggers) {
		this.courseDao = courseDao;
		this.loggers = loggers;
	}
	
	public void addCourse(Course course) throws Exception{
		
		if (courses.contains(course.getcourseName())) {
			throw new Exception("HATA! Girdiğiniz kurs ismi veri tabanında mevcuttur...");
		}
		
		if (course.getPrice()<0) {
			throw new Exception("HATA! Kursu fiyatı 0'dan küçük olamaz...");
		}
		
		courseDao.add();
		courses.add(course.getcourseName());
		
		
		for(Logger logger : loggers) {
			logger.log();
		}
		
		
		
	}
}
