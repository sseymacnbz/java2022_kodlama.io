package youTubeEgitim;

public class TeacherCreditManager implements ICreditManager{

	@Override
	public void calculate() {
		System.out.println("Ogretmen kredisi hesaplandi...");
		
	}

	@Override
	public void save() {
		System.out.println("Ogretmen kredisi kaydedildi...");
		
	}
	
}
