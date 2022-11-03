package kodlama.io.Devs.entities.concretes;

public class ProgrammingLanguages {
	
	private int id;
	private String langName;
	
	public ProgrammingLanguages() {
		super();
	}

	public ProgrammingLanguages(int id, String langName) {
		super();
		this.id = id;
		this.langName = langName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLangName() {
		return langName;
	}

	public void setLangName(String langName) {
		this.langName = langName;
	}
	
	
	
}
