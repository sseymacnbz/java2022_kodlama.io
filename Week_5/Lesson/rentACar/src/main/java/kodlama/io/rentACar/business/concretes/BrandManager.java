package kodlama.io.rentACar.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.rentACar.business.abstracts.BrandService;
import kodlama.io.rentACar.business.requests.CreateBrandRequest;
import kodlama.io.rentACar.business.responses.GetAllBrandsResponse;
import kodlama.io.rentACar.dataAccess.abstracts.BrandRepository;
import kodlama.io.rentACar.entities.concretes.Brand;

@Service // Sen bir IoC'sin demiş olduk. Bu sınıf bir bussiness nesnesidir demiş olduk Spring'e
public class BrandManager implements BrandService{
	private BrandRepository brandRepository;
	
	@Autowired
	public BrandManager(BrandRepository brandRepository) {
		super();
		this.brandRepository = brandRepository;
	}


	@Override
	public List<GetAllBrandsResponse> getAll() {
		
		List<Brand> brands = brandRepository.findAll();
		List<GetAllBrandsResponse> brandsResponse = new ArrayList<GetAllBrandsResponse>();
		
		for (Brand brand : brands) {
			GetAllBrandsResponse responseItem = new GetAllBrandsResponse();
			responseItem.setId(brand.getId());
			responseItem.setName(brand.getName());
			brandsResponse.add(responseItem);
			
			// Biz önce Brand kısmını GetAllBrandsResponse'a çevirdik ve
			// bunu 
		}
		
		// Buraya iş kuralları yazılacaktır.
		return brandsResponse;
	}


	@Override
	public void add(CreateBrandRequest createBrandRequest) {
		Brand brand = new Brand();
		brand.setName(createBrandRequest.getName());
		
		this.brandRepository.save(brand);
		
	}

}
