package br.com.cotiinformatica.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import br.com.cotiinformatica.entities.Cliente;

public interface IClienteRepository extends CrudRepository<Cliente, Integer>{
	
	@Query("SELECT c FROM Cliente c WHERE c.cpf = :param1")
	Cliente findByCpf(@Param("param1")String cpf);

}
