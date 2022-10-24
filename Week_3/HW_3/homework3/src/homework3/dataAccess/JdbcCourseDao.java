package homework3.dataAccess;

public class JdbcCourseDao implements CourseDao{

	@Override
	public void add() {
		System.out.println("Jdbc ile 'Course' Tablosuna eklendi...");
		
	}
	
}
