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
	private Opcional opcional;

	@ManyToMany
	List<Variante> variantes;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Opcional getOpcional() {
		return opcional;
	}

	public void setOpcional(Opcional opcional) {
		this.opcional = opcional;
	}

	public List<Variante> getVariantes() {
		return variantes;
	}

	public void setVariantes(List<Variante> variantes) {
		this.variantes = variantes;
	}

	
	public double getCostoFinal() {
		return opcional.getPrecio() + this.getCostoVariantes();
 	}
	
	public double getCostoVariantes() {
		if(!variantes.isEmpty()) {
			return variantes.stream().mapToDouble(v->v.getPrecio()).sum();
		}
		return 0;
	}

}
