package kodlama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.Devs.entities.concretes.ProgrammingLanguages;

@Repository
public class InMemoryProgrammingLanguageRepository implements ProgrammingLanguageRepository{
	
	List<ProgrammingLanguages> languages;
	public String addingMessage = "Adding Successful ! ";
	public String deletingMessage = "Deletion Successful ! ";
	public String updateMessage = "Update Successful ! ";
	
	public int id;
	public InMemoryProgrammingLanguageRepository() {
		languages = new ArrayList<>();
		languages.add(new ProgrammingLanguages(1, "Python"));
		languages.add(new ProgrammingLanguages(2, "Java"));
		languages.add(new ProgrammingLanguages(3, "Kotlin"));
		languages.add(new ProgrammingLanguages(4, "C++"));
		
		
	}




	@Override
	public List<ProgrammingLanguages> getAll() {
		return languages;
	}




	@Override
	public String add() throws Exception{
		String langName = "deneme";
		for(ProgrammingLanguages l : languages) {
			id = l.getId();
			
			if (langName.equals(l.getLangName())){
				throw new Exception ("There is a programming language with this name !!!");
			}
			
			else if (langName.isEmpty()) {
				throw new Exception ("Programming language name cannot be left blank !!!");
			}
		}
		
		
		languages.add(new ProgrammingLanguages(idGenerator(id), langName));
		return addingMessage;
	}

	


	@Override
	public String delete(int deleted) {
		for(ProgrammingLanguages l : languages) {
			if(l.getId() == deleted) {
				languages.remove(l);
			}
		}
		
		return deletingMessage;
	}
	
	
	@Override
	public String update(int updated, String langName) {
		
		languages.get(updated - 1).setLangName(langName);
		
		return updateMessage;
	}
	
	
	@Override
	public ProgrammingLanguages getById(int id) {
		return languages.get(id - 1);
	}
	
	
	public int idGenerator(int id) {
		return id+1;
	}


}
