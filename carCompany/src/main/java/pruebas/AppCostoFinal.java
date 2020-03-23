package pruebas;

import java.util.LinkedList;
import java.util.List;

import tp.carCompany.model.Auto;
import tp.carCompany.model.Opcional;
import tp.carCompany.model.Variante;
import tp.carCompany.service.impl.OpcionalesServiceJPA;
import tp.carCompany.service.impl.VariantesServiceJPA;

public class AppCostoFinal {

	public static void main(String[] args) {
		
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
		
		System.out.println("El costo final para el auto1 es: $" + auto1.getCostoFinal());
	}

}
