package pruebas;

import java.util.LinkedList;
import java.util.List;

import tp.carCompany.model.Auto;
import tp.carCompany.model.Variante;
import tp.carCompany.service.impl.OpcionalesServiceJPA;
import tp.carCompany.service.impl.VariantesServiceJPA;

public class AppCostoFinal {

	public static void main(String[] args) {
		
		OpcionalesServiceJPA opcionales = new OpcionalesServiceJPA();
		VariantesServiceJPA variantes = new VariantesServiceJPA();
		Auto auto1 = new Auto();
		
		int idOpcional = 0; //id del sedan
		
		Variante techoCorredizo = variantes.getVariantes().get(0);
		Variante airbag = variantes.getVariantes().get(3);
		List<Variante> misVariantes = null;
		misVariantes = new LinkedList<>();
		misVariantes.add(techoCorredizo);
		misVariantes.add(airbag);
		
		auto1.setOpcional(opcionales.getOpcionales().get(idOpcional));
		auto1.setVariantes(misVariantes);
		
		System.out.println("El costo final para el auto1 es: $" + auto1.getCostoFinal());
	}

}
