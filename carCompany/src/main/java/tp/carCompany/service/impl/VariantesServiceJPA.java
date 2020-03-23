package tp.carCompany.service.impl;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tp.carCompany.model.Opcional;
import tp.carCompany.model.Variante;
import tp.carCompany.repository.OpcionalesRepository;
import tp.carCompany.service.IOpcionalesService;
import tp.carCompany.service.IVariantesService;

@Service
public class VariantesServiceJPA implements IVariantesService {
	
	private List<Variante> variantes = null;
	
	public VariantesServiceJPA() {
		variantes = new LinkedList<>();
		
		Variante sedan = new Variante();
		sedan.setId(0);
		//sedan.nombre(sedan);
		sedan.setPrecio(230000);
		
		Variante familiar = new Variante();
		familiar.setId(1);
		familiar.setPrecio(245000);
		
		Variante coupe = new Variante();
		coupe.setId(2);
		coupe.setPrecio(270000);
		
		variantes.add(sedan);
		variantes.add(familiar);
		variantes.add(coupe);
	}
	
	@Override
	public List<Variante> getVariantes() {
		return variantes;
	}

	
	
	
}