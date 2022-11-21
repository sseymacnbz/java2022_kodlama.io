package kodlama.io.Devs.entities.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import kodlama.io.Devs.business.responses.GetAllSubTechnologiesResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name="programmingLanguages")
@Data

@AllArgsConstructor
@NoArgsConstructor
@Entity

public class ProgrammingLanguages {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="languageName")
	private String langName;
	
	@OneToMany(mappedBy="languages")
	private List<ProgrammingLanguagesSubTechnologies> programmingLanguagesSubTechnologies;
	
	
	
}
