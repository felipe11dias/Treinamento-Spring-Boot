package br.com.treinamentoSpringBoot.dto;

import java.time.LocalDateTime;

import br.com.treinamentoSpringBoot.model.Resposta;

public class RespostaDTO {
	
	private Long id;
	private String mensagem;
	private LocalDateTime dataCriacao;
	private String autor;
	
	public RespostaDTO(Resposta resposta) {
		super();
		this.id = resposta.getId();
		this.mensagem = resposta.getMensagem();
		this.dataCriacao = resposta.getDataCriacao();
		this.autor = resposta.getAutor().getNome();
	}

	public Long getId() {
		return id;
	}

	public String getMensagem() {
		return mensagem;
	}

	public LocalDateTime getDataCriacao() {
		return dataCriacao;
	}

	public String getAutor() {
		return autor;
	}
}
