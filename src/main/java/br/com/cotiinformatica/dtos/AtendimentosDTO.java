package br.com.cotiinformatica.dtos;

import java.util.Date;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AtendimentosDTO {
	
	private Integer idAtendimento;
	private Date data;
	private String hora;
	private String observacoes;
	
	
	private ClientesDTO cliente;
	private List<ServicosDTO> servicos;
}
