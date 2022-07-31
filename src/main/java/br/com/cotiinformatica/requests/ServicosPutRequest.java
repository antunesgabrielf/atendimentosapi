package br.com.cotiinformatica.requests;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ServicosPutRequest {

	private Integer idServico;
	private String nome;
	private Double preco;
}
