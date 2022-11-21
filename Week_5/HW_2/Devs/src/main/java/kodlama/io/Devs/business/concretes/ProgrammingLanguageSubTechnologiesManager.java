package kodlama.io.Devs.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.Devs.business.abstracts.ProgrammingLanguageSubTechnologiesService;
import kodlama.io.Devs.business.requests.CreateProgrammingLanguageSubTechnologyRequest;
import kodlama.io.Devs.business.requests.DeleteProgrammingLanguageSubTechnologyRequest;
import kodlama.io.Devs.business.requests.GetAllSubTechnologiesRequest;
import kodlama.io.Devs.business.requests.UpdateProgrammingLanguageSubTechnologyRequest;
import kodlama.io.Devs.business.responses.GetAllProgrammingLanguagesResponse;
import kodlama.io.Devs.business.responses.GetAllSubTechnologiesResponse;
import kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageSubTechnologiesRepository;
import kodlama.io.Devs.entities.concretes.ProgrammingLanguages;
import kodlama.io.Devs.entities.concretes.ProgrammingLanguagesSubTechnologies;

@Service
public class ProgrammingLanguageSubTechnologiesManager implements ProgrammingLanguageSubTechnologiesService{
	ProgrammingLanguageSubTechnologiesRepository subTechnologyRepository;
	ProgrammingLanguageRepository languageRepository;
	
	@Autowired
	public ProgrammingLanguageSubTechnologiesManager(ProgrammingLanguageSubTechnologiesRepository subTechnologyRepository, ProgrammingLanguageRepository languageRepository) {
		super();
		this.subTechnologyRepository = subTechnologyRepository;
		this.languageRepository = languageRepository;
	}


	@Override
	public List<GetAllSubTechnologiesResponse> getAll(GetAllSubTechnologiesRequest getAllSubTechnologiesRequest) {
		List<ProgrammingLanguages> languages = languageRepository.findAll();
		List<GetAllSubTechnologiesResponse> subTechResponse = new ArrayList<GetAllSubTechnologiesResponse>();
		
		for(ProgrammingLanguages language : languages) {
			if(getAllSubTechnologiesRequest.getLangName().equalsIgnoreCase(language.getLangName())){
				
				List<ProgrammingLanguagesSubTechnologies> subTechnologies = subTechnologyRepository.findAll();
				
				for(ProgrammingLanguagesSubTechnologies subTechnology : subTechnologies) {
					
					if(subTechnology.getLanguages().getLangName().equalsIgnoreCase(getAllSubTechnologiesRequest.getLangName())) {
						GetAllSubTechnologiesResponse responseItem = new GetAllSubTechnologiesResponse();
						responseItem.setSubTechnologies(subTechnology.getSubTechnologyName());
						subTechResponse.add(responseItem);
					}
				}
				
				break;
			}
		}
		
		return subTechResponse;
	}


	@Override
	public void add(CreateProgrammingLanguageSubTechnologyRequest createProgrammingLanguageSubTechnologyRequest){
		List<ProgrammingLanguages> languages = languageRepository.findAll();
		
		for(ProgrammingLanguages language : languages) {
			
			
			if(language.getLangName().equalsIgnoreCase(createProgrammingLanguageSubTechnologyRequest.getProgrammingLanguageName())) {
				ProgrammingLanguagesSubTechnologies subTechnology = new ProgrammingLanguagesSubTechnologies();
				subTechnology.setSubTechnologyName(createProgrammingLanguageSubTechnologyRequest.getSubTechnologyName());
				subTechnology.setLanguages(language);
				subTechnologyRepository.save(subTechnology);
				break;
			}
		}
		
	}


	@Override
	public void delete(DeleteProgrammingLanguageSubTechnologyRequest deleteProgrammingLanguageSubTechnologyRequest) {
		
		List<ProgrammingLanguagesSubTechnologies> subTechnologies = subTechnologyRepository.findAll();
		
		for (ProgrammingLanguagesSubTechnologies subTechnology : subTechnologies) {
			if(subTechnology.getSubTechnologyName().equalsIgnoreCase(deleteProgrammingLanguageSubTechnologyRequest.getSubTechnologyName())) {
				subTechnologyRepository.delete(subTechnology);
				break;
			}
		}
		
	}


	@Override
	public void update(UpdateProgrammingLanguageSubTechnologyRequest updateProgrammingLanguageSubTechnologyRequest) {
		List<ProgrammingLanguagesSubTechnologies> subTechnologies = subTechnologyRepository.findAll();
		
		for(ProgrammingLanguagesSubTechnologies subTechnology : subTechnologies) {
			if(subTechnology.getSubTechnologyName().equalsIgnoreCase(updateProgrammingLanguageSubTechnologyRequest.getSubTechnologyOldName())) {
				subTechnology.setSubTechnologyName(updateProgrammingLanguageSubTechnologyRequest.getSubTechnologyNewName());
				subTechnologyRepository.save(subTechnology);
				break;
			}
		}
	}
	
	

}
