package ma.emsi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ComiteOrganisation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Integer nombreDePersonnes;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Integer getNombreDePersonnes() {
		return nombreDePersonnes;
	}
	public void setNombreDePersonnes(Integer nombreDePersonnes) {
		this.nombreDePersonnes = nombreDePersonnes;
	}
	public ComiteOrganisation(int id, Integer nombreDePersonnes) {
		super();
		this.id = id;
		this.nombreDePersonnes = nombreDePersonnes;
	}
	public ComiteOrganisation() {
		super();
		// TODO Auto-generated constructor stub
	}

    
}