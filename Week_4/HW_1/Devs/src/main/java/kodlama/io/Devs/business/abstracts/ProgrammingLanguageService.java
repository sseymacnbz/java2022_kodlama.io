package kodlama.io.Devs.business.abstracts;

import java.util.List;

import kodlama.io.Devs.entities.concretes.ProgrammingLanguages;

public interface ProgrammingLanguageService {
	List<ProgrammingLanguages> getAll();
	String add() throws Exception;
	String delete();
	String update();
	ProgrammingLanguages getById();
}
