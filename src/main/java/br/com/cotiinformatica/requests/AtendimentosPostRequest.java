package br.com.cotiinformatica.requests;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AtendimentosPostRequest {

	private String data;
	private String hora;
	private String observacoes;
	private Integer IdCliente;
	private List<Integer> IdsServicos;
}
