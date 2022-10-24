package homework3.dataAccess;

public class JdbcInstructorDao implements InstructorDao{

	@Override
	public void add() {
		System.out.println("Jdbc ile 'Instructor' Tablosuna eklendi...");
		
	}

}
