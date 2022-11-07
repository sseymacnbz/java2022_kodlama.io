package kodlama.io.rentACar.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name="brands")
@Data // Bize getter ve setter'ları otomatik olarak oluşturur
	  // bazen sadece getter veya setter olsun isteriz o zaman da @Data yerine @Getter ve @Setter olarak kullanabiliriz
@AllArgsConstructor //Paramtereli constructor oluşturur
@NoArgsConstructor // Parametresiz constructor oluşturur. Sağ taraftaki pencereden(outline) biz yazmadan oluşturulanları görebilirsin
@Entity // Sen bir veri tabanı verisisin dedik aslında

public class Brand {
	@Id // Sen bir PK'sin
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Bununla da id otomatik 1'er 1'er arttır diyoruz
	@Column(name="id") // Biz bunları veri tabanı ile eşleştirdiğimizden tek tek belirtiyoruz.
	private int id;
	
	@Column(name="name")
	private String name;
	
}
