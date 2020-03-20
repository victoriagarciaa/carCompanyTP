package tp.carCompany.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import tp.carCompany.repository.OpcionalesRepository;
import tp.carCompany.service.IOpcionalesService;

public class OpcionalesServiceJPA implements IOpcionalesService {
	
	@Autowired 
	private OpcionalesRepository opcionalesRepo;
	
}