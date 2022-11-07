package kodlama.io.rentACar.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.rentACar.business.abstracts.BrandService;
import kodlama.io.rentACar.business.requests.CreateBrandRequest;
import kodlama.io.rentACar.business.responses.GetAllBrandsResponse;
import kodlama.io.rentACar.entities.concretes.Brand;

@RestController // annotation, spring fw bu uygulamayı derlediğinde kimde rest controller var diye arar ve burası erişim noktası der
@RequestMapping("/api/brands") // 

public class BrandsController {
	private BrandService brandService;

	@Autowired // Git ve constructor un parametrelerine bak. Brand Service. Git ve uygulamayı tara. Kim implemente ediyo Brand SErvice. Git ordaki metodu al
	public BrandsController(BrandService brandService) {
		super();
		this.brandService = brandService;
	}
	
	@GetMapping("/getAll")
	public List<GetAllBrandsResponse> getAll(){
		return brandService.getAll();
	}
	
	@PostMapping("/add")
	public void add(CreateBrandRequest createBrandRequest) {
		this.brandService.add(createBrandRequest);
		
	}
}
