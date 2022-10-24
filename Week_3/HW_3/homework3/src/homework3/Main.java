package homework3;

import homework3.entities.Course;
import homework3.business.CategoryManager;
import homework3.business.CourseManager;
import homework3.business.InstructorManager;
import homework3.core.logging.DatabaseLogger;
import homework3.core.logging.FileLogger;
import homework3.core.logging.Logger;
import homework3.core.logging.MailLogger;
import homework3.dataAccess.CategoryDao;
import homework3.dataAccess.JdbcCategoryDao;
import homework3.dataAccess.JdbcCourseDao;
import homework3.dataAccess.JdbcInstructorDao;
import homework3.entities.Category;
import homework3.entities.EntitiesManager;
import homework3.entities.Id;
import homework3.entities.Instructor;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception{
		
		Course course = new Course(0, "deneme", "deneme2", 12);
		Category category = new Category(0, "denem3");
		Instructor instructor = new Instructor(0, "Ali","Veli",30);
		
		EntitiesManager[] entitiesManager = {course, category, instructor};
		Logger[]loggers={new DatabaseLogger(),new FileLogger(),new MailLogger()};
		
		
		CategoryManager categoryManager = new CategoryManager(new JdbcCategoryDao(), loggers);
		categoryManager.addCategory(category);
		
		CourseManager courseManager = new CourseManager(new JdbcCourseDao(), loggers);
		courseManager.addCourse(course);
		
		InstructorManager instructorManager = new InstructorManager(new JdbcInstructorDao(), loggers);
		instructorManager.addInstructor(instructor);

	}

}


