package tp.carCompany.service.impl;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import tp.carCompany.model.Variante;
import tp.carCompany.service.IVariantesService;


public class VariantesServiceJPA implements IVariantesService{

	//VariantesRepository variantesRepo;
	
	List<Variante> variantes = null;
	
	public VariantesServiceJPA() {
		variantes = new LinkedList<>();
		
		Variante techoCorredizo = new Variante();
		techoCorredizo.setId(0);
		techoCorredizo.setPrecio(12000);
		
		Variante aireAcondicionado = new Variante();
		aireAcondicionado.setId(1);
		aireAcondicionado.setPrecio(20000);
		
		Variante sistemaFrenos = new Variante();
		sistemaFrenos.setId(2);
		sistemaFrenos.setPrecio(14000);
		
		Variante airbag = new Variante();
		airbag.setId(3);
		airbag.setPrecio(7000);
		
		Variante llantasDeAleacion = new Variante();
		llantasDeAleacion.setId(4);
		llantasDeAleacion.setPrecio(12000);
		
		variantes.add(techoCorredizo);
		variantes.add(aireAcondicionado);
		variantes.add(sistemaFrenos);
		variantes.add(airbag);
		variantes.add(llantasDeAleacion);
		
	}

	@Override
	public List<Variante> getVariantes() {
		return variantes;
	}
	
//	public List<Variante> getVariantesDeIds(List<Long> ids) {
//		
//	}
	
	
}
