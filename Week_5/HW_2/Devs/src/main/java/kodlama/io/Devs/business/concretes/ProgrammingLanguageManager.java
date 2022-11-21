package kodlama.io.Devs.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import kodlama.io.Devs.business.requests.CreateProgrammingLanguageRequest;
import kodlama.io.Devs.business.requests.DeleteProgrammingLanguageRequest;
import kodlama.io.Devs.business.requests.GetLanguageByIdRequest;
import kodlama.io.Devs.business.requests.UpdateProgrammingLanguageRequest;
import kodlama.io.Devs.business.responses.GetAllProgrammingLanguagesResponse;
import kodlama.io.Devs.business.responses.GetLanguageByIdResponse;
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
	public List<GetAllProgrammingLanguagesResponse> getAll() {
		List<ProgrammingLanguages> languages = languageRepository.findAll();
		List<GetAllProgrammingLanguagesResponse> languageResponse = new ArrayList<GetAllProgrammingLanguagesResponse>();
		
		for(ProgrammingLanguages language: languages) {
			GetAllProgrammingLanguagesResponse responseItem = new GetAllProgrammingLanguagesResponse();
			responseItem.setId(language.getId());
			responseItem.setLanguageName(language.getLangName());
			languageResponse.add(responseItem);
		}
		
		return languageResponse;
	}


	@Override
	public void add(CreateProgrammingLanguageRequest createProgrammingLanguageRequest) throws Exception{
		ProgrammingLanguages language = new ProgrammingLanguages();
		List<ProgrammingLanguages> languages = languageRepository.findAll();
		
		for(ProgrammingLanguages langName : languages) {
			if(langName.getLangName().equalsIgnoreCase(createProgrammingLanguageRequest.getLanguageName())) {
				throw new Exception ("There is a programming language with this name !!!");
			}
			
			else if(createProgrammingLanguageRequest.getLanguageName().isEmpty()) {
				throw new Exception ("Programming language name cannot be left blank !!!");
			}
		}
		
		language.setLangName(createProgrammingLanguageRequest.getLanguageName());
		this.languageRepository.save(language);
		
	}


	@Override
	public void delete(DeleteProgrammingLanguageRequest deleteProgrammingLanguageRequest) {

		List<ProgrammingLanguages> languages = languageRepository.findAll();
		for(ProgrammingLanguages language : languages) {
			if(language.getId() == deleteProgrammingLanguageRequest.getId()) {
				this.languageRepository.delete(language);
				break;
			}
		}
		
	}


	@Override
	public void update(UpdateProgrammingLanguageRequest updateProgrammingLanguageRequest) {
		List<ProgrammingLanguages> languages = languageRepository.findAll();
		for(ProgrammingLanguages language : languages) {
			if(language.getId() == updateProgrammingLanguageRequest.getId()) {
				language.setLangName(updateProgrammingLanguageRequest.getLanguageName());
				this.languageRepository.save(language);
				break;
			}
		}
	}


	@Override
	public GetLanguageByIdResponse getById(GetLanguageByIdRequest getLanguageByIdRequest) {
		GetLanguageByIdResponse responseItem = new GetLanguageByIdResponse();
		List<ProgrammingLanguages> languages = languageRepository.findAll();
		
		for (ProgrammingLanguages language : languages) {
			if(language.getId() == getLanguageByIdRequest.getId()) {
				responseItem.setLanguageName(language.getLangName());
				break;
			}
		}
		return responseItem;
	}

}
