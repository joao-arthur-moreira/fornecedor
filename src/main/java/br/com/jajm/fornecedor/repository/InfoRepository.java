package br.com.jajm.fornecedor.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.jajm.fornecedor.model.InfoFornecedor;

public interface InfoRepository extends JpaRepository<InfoFornecedor, Long> {
	
	InfoFornecedor findByEstado(String estado);

}
