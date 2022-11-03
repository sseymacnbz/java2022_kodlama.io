package kodlama.io.Devs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.Devs.entities.concretes.ProgrammingLanguages;

@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService{

	ProgrammingLanguageRepository languageRepository;
	
	@Autowired
	public ProgrammingLanguageManager(ProgrammingLanguageRepository languageRepository) {
		super();
		this.languageRepository = languageRepository;
	}


	@Override
	public List<ProgrammingLanguages> getAll() {
		// TODO Auto-generated method stub
		return languageRepository.getAll();
	}


	@Override
	public String add() throws Exception{
		return languageRepository.add();
	}


	@Override
	public String delete() {
		return languageRepository.delete(3);
	}


	@Override
	public String update() {
		return languageRepository.update(3, "NodeJs");
	}


	@Override
	public ProgrammingLanguages getById() {
		return languageRepository.getById(3);
	}

}
