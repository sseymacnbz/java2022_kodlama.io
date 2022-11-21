package kodlama.io.Devs.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.Devs.entities.concretes.ProgrammingLanguagesSubTechnologies;

public interface ProgrammingLanguageSubTechnologiesRepository extends JpaRepository<ProgrammingLanguagesSubTechnologies, Integer>{

}
