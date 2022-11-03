package kodlama.io.Devs.dataAccess.abstracts;

import java.util.List;

import kodlama.io.Devs.entities.concretes.ProgrammingLanguages;

public interface ProgrammingLanguageRepository {
	
	List<ProgrammingLanguages> getAll();
	String add() throws Exception;
	String delete(int deleted);
	String update(int updated, String langName);
	ProgrammingLanguages getById(int id);
}
