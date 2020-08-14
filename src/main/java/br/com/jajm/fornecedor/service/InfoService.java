package br.com.jajm.fornecedor.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.jajm.fornecedor.model.InfoFornecedor;
import br.com.jajm.fornecedor.repository.InfoRepository;

@Service
public class InfoService {
	
	@Autowired
	private InfoRepository infoRepository;

	public InfoFornecedor porEstado(String estado) {
		return infoRepository.findByEstado(estado);
	}

}
