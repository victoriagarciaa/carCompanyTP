package tp.carCompany.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Autos")
public class Auto {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@ManyToOne
	private Variante variante;

	@ManyToMany
	List<Opcional> opcionales;



	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Variante getVariante() {
		return variante;
	}

	public void setVariante(Variante variante) {
		this.variante = variante;
	}

	public List<Opcional> getOpcionales() {
		return opcionales;
	}

	public void setOpcionales(List<Opcional> opcionales) {
		this.opcionales = opcionales;
	}

	
	public double getCostoFinal() {
		return variante.getPrecio() + this.getCostoOpcionales();
 	}
	
	public double getCostoOpcionales() {
		if(!opcionales.isEmpty()) {
			return opcionales.stream().mapToDouble(o->o.getPrecio()).sum();
		}
		return 0;
	}

}
