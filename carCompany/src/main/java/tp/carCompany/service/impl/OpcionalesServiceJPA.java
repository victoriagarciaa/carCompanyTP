package tp.carCompany.service.impl;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tp.carCompany.model.Opcional;
import tp.carCompany.model.Variante;
import tp.carCompany.service.IOpcionalesService;
import tp.carCompany.service.IVariantesService;

@Service
public class OpcionalesServiceJPA implements IOpcionalesService{

	
	List<Opcional> opcionales = null;
	
	public OpcionalesServiceJPA() {
		opcionales = new LinkedList<>();
		
		Opcional techoCorredizo = new Opcional();
		techoCorredizo.setId(0);
		techoCorredizo.setPrecio(12000);
		
		Opcional aireAcondicionado = new Opcional();
		aireAcondicionado.setId(1);
		aireAcondicionado.setPrecio(20000);
		
		Opcional sistemaFrenos = new Opcional();
		sistemaFrenos.setId(2);
		sistemaFrenos.setPrecio(14000);
		
		Opcional airbag = new Opcional();
		airbag.setId(3);
		airbag.setPrecio(7000);
		
		Opcional llantasDeAleacion = new Opcional();
		llantasDeAleacion.setId(4);
		llantasDeAleacion.setPrecio(12000);
		
		opcionales.add(techoCorredizo);
		opcionales.add(aireAcondicionado);
		opcionales.add(sistemaFrenos);
		opcionales.add(airbag);
		opcionales.add(llantasDeAleacion);
		
	}

	@Override
	public List<Opcional> getOpcionales() {
		return opcionales;
	}
	
//	public List<Variante> getVariantesDeIds(List<Long> ids) {
//		
//	}
	
	
}
