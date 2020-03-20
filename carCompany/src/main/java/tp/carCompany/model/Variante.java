package tp.carCompany.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table(name = "Variantes")
public class Variante {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) 
	private long id;
	
	@Column(name = "PrecioBasico")
	private double precioBasico;
	
	@ManyToMany
	List<Opcional> opcionales;

	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public double getPrecioBasico() {
		return precioBasico;
	}

	public void setPrecioBasico(double precioBasico) {
		this.precioBasico = precioBasico;
	}

	public List<Opcional> getOpcionales() {
		return opcionales;
	}

	public void setOpcionales(List<Opcional> opcionales) {
		this.opcionales = opcionales;
	}
	
	
	public double getPrecioFinal() {
		return this.getPrecioBasico() + this.getPrecioOpcionales();
	}
	
	public double getPrecioOpcionales() {
		return opcionales.stream().mapToDouble(o -> o.getPrecio()).sum();
	}
}