package tp.carCompany.service.impl;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

import tp.carCompany.model.Auto;
import tp.carCompany.model.Opcional;
import tp.carCompany.service.IAutosService;

@Service
public class AutosServiceJPA implements IAutosService {

	List<Auto> autos = null;
	
	@Override
	public List<Auto> buscarTodos() {
		OpcionalesServiceJPA opcionalesService = new OpcionalesServiceJPA();
		VariantesServiceJPA variantesService = new VariantesServiceJPA();
		Auto auto1 = new Auto();
		
		int idVariante = 1; //id = 1 es familiar
		
		Opcional techoCorredizo = opcionalesService.getOpcionales().get(0);
		Opcional airbag = opcionalesService.getOpcionales().get(3);
		List<Opcional> misOpcionales = null;
		misOpcionales = new LinkedList<>();
		misOpcionales.add(techoCorredizo);
		misOpcionales.add(airbag);
		
		auto1.setVariante(variantesService.getVariantes().get(idVariante));
		auto1.setOpcionales(misOpcionales);
		
		autos.add(auto1);
		return autos;
	}
}
