package tp.carCompany.service.impl;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import tp.carCompany.model.Opcional;
import tp.carCompany.repository.OpcionalesRepository;
import tp.carCompany.service.IOpcionalesService;

public class OpcionalesServiceJPA implements IOpcionalesService {
	
	//private OpcionalesRepository opcionalesRepo;

	private List<Opcional> opcionales = null;
	
	public OpcionalesServiceJPA() {
		opcionales = new LinkedList<>();
		
		Opcional sedan = new Opcional();
		sedan.setId(0);
		sedan.setPrecio(230000);
		
		Opcional familiar = new Opcional();
		familiar.setId(1);
		familiar.setPrecio(245000);
		
		Opcional coupe = new Opcional();
		coupe.setId(2);
		coupe.setPrecio(270000);
		
		opcionales.add(sedan);
		opcionales.add(familiar);
		opcionales.add(coupe);
	}
	
	@Override
	public List<Opcional> getOpcionales() {
		return opcionales;
	}

	
	
	
}