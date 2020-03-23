package tp.carCompany.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tp.carCompany.model.Auto;
import tp.carCompany.service.IAutosService;
import tp.carCompany.service.IOpcionalesService;
import tp.carCompany.service.IVariantesService;

@RestController
@RequestMapping(value="/autos")
public class AutoController {
	
//	@Autowired 
//	IOpcionalesService opcionalesService;
//	
//	@Autowired
//	IVariantesService variantesService;
	
	//@Autowired
	IAutosService autosService;
	
	@GetMapping(value="/searchAll", produces= {"application/json"})
	public List<Auto> listar() {
		return autosService.buscarTodos();
	}
	

}
