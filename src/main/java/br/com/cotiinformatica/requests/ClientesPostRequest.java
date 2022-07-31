package br.com.cotiinformatica.requests;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClientesPostRequest {

	private String nome;
	private String telefone;
	private String cpf;
	
}
