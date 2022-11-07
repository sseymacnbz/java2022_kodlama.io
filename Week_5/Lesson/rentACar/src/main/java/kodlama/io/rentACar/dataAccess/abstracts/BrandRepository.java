package kodlama.io.rentACar.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.rentACar.entities.concretes.Brand;

//Ctrl+Shift+O otomatik olarak kullanılmayan importları siler
public interface BrandRepository extends JpaRepository<Brand,Integer>{
	//Brand'de kullanılan id primary key olacak ve bunun tipi de integer olduğundan yukarıdaki gibi yazdık
	
	// Buradaki operasyonları sildik çünkü findAll getById gibi şeyleri jpa bize sağlar zaten
	// Spring sayesinde bir concrete kısmına ihtiyacımız olmayacak boş kalacak
}
