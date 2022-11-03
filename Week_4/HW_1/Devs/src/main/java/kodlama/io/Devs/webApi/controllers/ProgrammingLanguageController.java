package kodlama.io.Devs.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import kodlama.io.Devs.entities.concretes.ProgrammingLanguages;

@RestController
@RequestMapping("/api/brands")

public class ProgrammingLanguageController {
	ProgrammingLanguageService languageService;
	
	@Autowired
	public ProgrammingLanguageController(ProgrammingLanguageService languageService) {
		super();
		this.languageService = languageService;
	}
	
	@GetMapping("/getAll")
	public List<ProgrammingLanguages> getAll(){
		return languageService.getAll();
	}
	
	@GetMapping("/add")
	public String add() throws Exception{
		return languageService.add();
	}
	
	@GetMapping("/delete")
	public String delete() {
		return languageService.delete();
	}
	
	@GetMapping("/update")
	public String update() {
		return languageService.update();
	}
	
	@GetMapping("/getById")
	public ProgrammingLanguages getById() {
		return languageService.getById();
	}
}
