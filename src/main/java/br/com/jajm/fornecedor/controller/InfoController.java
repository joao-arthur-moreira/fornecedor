package br.com.jajm.fornecedor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.jajm.fornecedor.model.InfoFornecedor;
import br.com.jajm.fornecedor.service.InfoService;

@RestController
@RequestMapping(path = "/info")
public class InfoController {
	
	@Autowired
	private InfoService infoService;
	
	@GetMapping("/{estado}")
	public InfoFornecedor infoPorEstado(@PathVariable String estado) {
		System.out.println(estado);
		
		return infoService.porEstado(estado);
	}

}
