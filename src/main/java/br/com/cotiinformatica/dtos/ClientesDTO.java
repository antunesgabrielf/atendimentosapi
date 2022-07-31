package br.com.cotiinformatica.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClientesDTO {
	
	private Integer idCliente;
	private String nome;
	private String cpf;
	private String telefone;

}
