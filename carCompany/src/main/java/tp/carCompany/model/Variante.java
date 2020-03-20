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
	
	@Column(name = "Precio")
	private double precio;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Variante [id=" + id + ", precio=" + precio + "]";
	}
	
	
}