package tp.carCompany.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tp.carCompany.service.IOpcionalesService;


@RestController
@RequestMapping(value="opcional")
public class OpcionalController {
	
	@Autowired
	IOpcionalesService opcionalesService;
}