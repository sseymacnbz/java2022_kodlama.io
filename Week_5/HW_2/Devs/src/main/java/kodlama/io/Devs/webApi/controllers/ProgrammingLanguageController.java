package kodlama.io.Devs.webApi.controllers;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import kodlama.io.Devs.business.requests.CreateProgrammingLanguageRequest;
import kodlama.io.Devs.business.requests.DeleteProgrammingLanguageRequest;
import kodlama.io.Devs.business.requests.GetLanguageByIdRequest;
import kodlama.io.Devs.business.requests.UpdateProgrammingLanguageRequest;
import kodlama.io.Devs.business.responses.GetAllProgrammingLanguagesResponse;
import kodlama.io.Devs.business.responses.GetLanguageByIdResponse;
import kodlama.io.Devs.entities.concretes.ProgrammingLanguages;
@RestController
@RequestMapping("/api/programminglanguage")

public class ProgrammingLanguageController {
	ProgrammingLanguageService languageService;
	
	@Autowired
	public ProgrammingLanguageController(ProgrammingLanguageService languageService) {
		super();
		this.languageService = languageService;
	}
	
	@GetMapping("/getAll")
	public List<GetAllProgrammingLanguagesResponse> getAll(){
		return languageService.getAll();
	}
	
	
	@PostMapping("/add")
	public void add(CreateProgrammingLanguageRequest createProgrammingLanguageRequest) throws Exception{
		this.languageService.add(createProgrammingLanguageRequest);
	}
	
	@DeleteMapping("/delete")
	public void delete(DeleteProgrammingLanguageRequest deleteProgrammingLanguageRequest) {
		this.languageService.delete(deleteProgrammingLanguageRequest);
	}
	
	
	@PutMapping("/update")
	public void update(UpdateProgrammingLanguageRequest updateProgrammingLanguageRequest) {
		this.languageService.update(updateProgrammingLanguageRequest);
	}
	
	@GetMapping("/getById")
	public GetLanguageByIdResponse getById(GetLanguageByIdRequest getLanguageByIdRequest) {
		return languageService.getById(getLanguageByIdRequest);
	}
}
