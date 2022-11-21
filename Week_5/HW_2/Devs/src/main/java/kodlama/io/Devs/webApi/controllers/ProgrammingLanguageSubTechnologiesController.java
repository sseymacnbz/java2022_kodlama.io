package kodlama.io.Devs.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.Devs.business.abstracts.ProgrammingLanguageSubTechnologiesService;
import kodlama.io.Devs.business.requests.CreateProgrammingLanguageSubTechnologyRequest;
import kodlama.io.Devs.business.requests.DeleteProgrammingLanguageSubTechnologyRequest;
import kodlama.io.Devs.business.requests.GetAllSubTechnologiesRequest;
import kodlama.io.Devs.business.requests.UpdateProgrammingLanguageSubTechnologyRequest;
import kodlama.io.Devs.business.responses.GetAllProgrammingLanguagesResponse;
import kodlama.io.Devs.business.responses.GetAllSubTechnologiesResponse;

@RestController
@RequestMapping("/api/programminglanguage/subtechnologies")

public class ProgrammingLanguageSubTechnologiesController {
	ProgrammingLanguageSubTechnologiesService subTechnologyService;
	
	@Autowired
	public ProgrammingLanguageSubTechnologiesController(ProgrammingLanguageSubTechnologiesService subTechnologyService) {
		super();
		this.subTechnologyService = subTechnologyService;
	}
	
	@GetMapping("/getAll")
	public List<GetAllSubTechnologiesResponse> getAll(GetAllSubTechnologiesRequest getAllSubTechnologiesRequest){
		return subTechnologyService.getAll(getAllSubTechnologiesRequest);
	}
	
	@PostMapping("/add")
	public void add(CreateProgrammingLanguageSubTechnologyRequest createProgrammingLanguageSubTechnologyRequest) {
		this.subTechnologyService.add(createProgrammingLanguageSubTechnologyRequest);
	}
	
	@DeleteMapping("/delete")
	public void delete(DeleteProgrammingLanguageSubTechnologyRequest deleteProgrammingLanguageSubTechnologyRequest) {
		this.subTechnologyService.delete(deleteProgrammingLanguageSubTechnologyRequest);
	}
	
	@PutMapping("/update")
	public void update(UpdateProgrammingLanguageSubTechnologyRequest updateProgrammingLanguageSubTechnologyRequest) {
		this.subTechnologyService.update(updateProgrammingLanguageSubTechnologyRequest);
	}
	
	
	
}
