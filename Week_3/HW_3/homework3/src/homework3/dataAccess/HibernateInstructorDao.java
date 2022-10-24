package homework3.dataAccess;

public class HibernateInstructorDao implements InstructorDao{

	@Override
	public void add() {
		System.out.println("Hibernate ile 'Instructor' Tablosuna eklendi...");
	}

}
