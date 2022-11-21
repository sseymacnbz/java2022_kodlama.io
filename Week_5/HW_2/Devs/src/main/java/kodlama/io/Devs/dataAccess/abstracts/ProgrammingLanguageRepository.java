package kodlama.io.Devs.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.Devs.entities.concretes.ProgrammingLanguages;

public interface ProgrammingLanguageRepository extends JpaRepository<ProgrammingLanguages, Integer>{
	
}
