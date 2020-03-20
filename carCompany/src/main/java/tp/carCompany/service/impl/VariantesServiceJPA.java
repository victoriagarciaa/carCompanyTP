package tp.carCompany.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import tp.carCompany.service.IVariantesService;


public class VariantesServiceJPA implements IVariantesService{

	@Autowired
	tp.carCompany.repository.VariantesRepository variantesRepo;
}
