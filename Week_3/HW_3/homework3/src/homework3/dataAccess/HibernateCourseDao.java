package homework3.dataAccess;

public class HibernateCourseDao implements CourseDao{

	@Override
	public void add() {
		System.out.println("Hibernate ile 'Course' Tablosuna eklendi...");
		
	}

}
